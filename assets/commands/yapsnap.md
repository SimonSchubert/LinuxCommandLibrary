# TAGLINE

Offline CPU speech-to-text from video URLs or local media

# TLDR

**Transcribe** a local audio or video file to plaintext

```yapsnap [path/to/file.mp4]```

**Transcribe** a video from a URL (YouTube, X, TikTok, etc.)

```yapsnap "[https://www.youtube.com/watch?v=...]"```

**Include timestamps** in the output

```yapsnap [input.mp4] --timestamps```

**Write the transcript** to a specific path

```yapsnap [input.mp4] -o [path/to/transcript.txt]```

**Preserve the downloaded audio** after a URL transcription

```yapsnap "[url]" --keep-audio```

**Disable the audio speedup** preprocessing

```yapsnap [input.mp4] --speed 1.0```

**Use a custom model directory**

```yapsnap [input.mp4] --model [path/to/model_dir]```

# SYNOPSIS

**yapsnap** _input_ [_options_]

The alias **transcribe** is also installed and behaves identically.

# PARAMETERS

**-o**, **--output** _PATH_
> Write the transcript to _PATH_ instead of the default **./transcripts/<input>_transcript.txt**.

**--timestamps**
> Emit one sentence per line prefixed with **[MM:SS]** instead of a single paragraph.

**--speed** _FACTOR_
> Speed up audio by _FACTOR_ before transcription (default **1.5**, pitch preserved). Set to **1.0** to disable.

**--keep-audio**
> Keep the extracted audio file after transcribing a URL.

**--model** _DIR_
> Override the model directory; falls back to the **KROKO_MODEL** environment variable, then to the cached default.

**--help**
> Show the full option list and exit.

# DESCRIPTION

**yapsnap** is a single-command speech-to-text tool that transcribes audio from local files or remote video URLs into plaintext. It runs entirely on CPU using a streaming **Zipformer** transducer (Kroko English) and downloads the ~80 MB model once on first run, after which it operates fully offline with no API keys and no audio leaving the machine.

URL inputs are fetched with **yt-dlp** and decoded with **ffmpeg**, so anything those tools can handle (YouTube, YouTube Shorts, X/Twitter, TikTok, Instagram Reels, direct media URLs) is fair game. Local files cover the common containers and codecs (**mp3**, **mp4**, **m4a**, **wav**, **webm**, **mov**, **mkv**, ...).

By default the audio is sped up by 1.5x (pitch-preserved) before transcription, which keeps quality usable while shrinking wall-clock time well below real time on a laptop. Output is a single paragraph of plain text; **--timestamps** switches to a per-sentence layout.

# CAVEATS

Requires **ffmpeg** on **PATH**; the installer does not bundle it. The default model is English-only, though additional models exist for French, German, Spanish, Italian, Portuguese, Dutch, Swedish, Swiss German, Hebrew, and Turkish (select via **--model**). Accuracy depends on input clarity: noisy audio, heavy accents, or overlapping speakers degrade output. The first run blocks on a one-time model download.

# HISTORY

**yapsnap** was released in **2025** by GitHub user **kouhxp** as a minimal, local-first alternative to cloud speech-to-text APIs, built around the open **Kroko** Zipformer models. The repository is **github.com/kouhxp/yapsnap**.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [ffmpeg](/man/ffmpeg)(1), [whisper](/man/whisper)(1)
