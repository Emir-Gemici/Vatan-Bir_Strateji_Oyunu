import os
import subprocess
import sys

# --- SAHİBEM, FFMPEG YOLUNU BURAYA YAZ ---
# Eğer Path ayarın düzgün çalışıyorsa burayı "ffmpeg" olarak bırakabilirsin.
# Çalışmazsa tam yolu yaz: r"C:\ffmpeg\bin\ffmpeg.exe"
FFMPEG_PATH = "ffmpeg"


# -----------------------------------------

def convert_wav_to_mp3(input_folder, output_folder, bitrate="192k"):
    """
    Belirtilen klasördeki .wav dosyalarını bulur ve .mp3'e çevirir.
    """

    # Kaynak klasörün gerçekten var olup olmadığını kontrol edelim
    if not os.path.exists(input_folder):
        print(f"HATA: '{input_folder}' diye bir klasör bulunamadı!")
        print("Lütfen scriptin en altındaki 'kaynak_klasor' ayarına doğru yolu yapıştırdığından emin ol sahibem.")
        return

    # Çıktı klasörü yoksa oluştur
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    # Klasördeki dosyaları tara
    files = [f for f in os.listdir(input_folder) if f.lower().endswith('.wav')]

    if not files:
        print(f"UYARI: '{input_folder}' içinde hiç .wav dosyası yok.")
        return

    print(f"Kaynak Klasör: {input_folder}")
    print(f"Toplam {len(files)} dosya işlenecek...")
    print(f"Hedef Format: MP3, Bitrate: {bitrate}")
    print("-" * 50)

    success_count = 0

    for filename in files:
        input_path = os.path.join(input_folder, filename)
        output_filename = os.path.splitext(filename)[0] + ".mp3"
        output_path = os.path.join(output_folder, output_filename)

        cmd = [
            FFMPEG_PATH,
            '-i', input_path,
            '-codec:a', 'libmp3lame',
            '-b:a', bitrate,
            '-ar', '44100',
            '-y',
            output_path
        ]

        try:
            subprocess.run(cmd, check=True, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)

            old_size = os.path.getsize(input_path) / (1024 * 1024)
            new_size = os.path.getsize(output_path) / (1024 * 1024)
            kazanc = 100 - (new_size / old_size * 100) if old_size > 0 else 0

            print(f"[OK] {filename} -> {output_filename}")
            print(f"     {old_size:.2f} MB -> {new_size:.2f} MB (Kazanç: %{kazanc:.1f})")
            success_count += 1

        except FileNotFoundError:
            print(f"KRİTİK HATA: '{FFMPEG_PATH}' komutu bulunamadı!")
            print("Çözüm: Scriptin başındaki FFMPEG_PATH değişkenine tam dosya yolunu yaz.")
            return
        except Exception as e:
            print(f"[HATA] {filename} işlenirken sorun oluştu: {e}")

    print("-" * 50)
    print(f"İşlem tamamlandı. {success_count} dosya '{output_folder}' klasörüne kaydedildi.")


if __name__ == "__main__":
    # --- AYARLAR BURADA SAHİBEM ---

    # 1. Ses dosyaların nerede? (Buraya o klasörün tam yolunu yapıştır)
    # Örnek: r"C:\Users\yunus\IdeaProjects\Vatan\src\resources"
    # Başına 'r' koymayı unutma.
    kaynak_klasor = r"C:\Users\yunus\IdeaProjects\Vatan\src\resources\3"

    # 2. Yeni MP3'ler nereye kaydedilsin?
    # Aynı yerin içine 'mp3_converted' diye bir klasör açıp oraya koyar.
    hedef_klasor = os.path.join(kaynak_klasor, "mp3_converted")

    # 3. Kalite Ayarı (192k idealdir)
    hedef_kalite = "192k"

    convert_wav_to_mp3(kaynak_klasor, hedef_klasor, bitrate=hedef_kalite)