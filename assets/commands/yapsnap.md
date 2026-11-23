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

**Label speakers** with a known speaker count

```yapsnap [interview.mp3] --diarize --num-speakers [2]```

**Force the language** instead of auto-detecting it

```yapsnap [input.mp3] --lang [fr]```

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

**--diarize**
> Label speakers (**SPEAKER_00 [MM:SS]: ...**). Implies **--timestamps**.

**--diarize-model** _NAME_
> Segmentation model: **pyannote** (default) or **reverb** (non-commercial license).

**--diarize-model-dir** _DIR_
> Use local diarization models instead of downloading them.

**--num-speakers** _N_
> Known speaker count for **--diarize** (default **-1**, auto-detect).

**--lang** _CODE_
> Language code (**de**, **en**, **es**, **fr**, **it**, **iw**, **nl**, **pt**, **sv**, **tr**) or **auto** (default) to detect it from the audio. Ignored when **--model** is given.

**--speed** _FACTOR_
> Speed up audio by _FACTOR_ before transcription (default **1.4**, pitch preserved). Set to **1.0** to disable.

**--workers** _N_
> Chunks decoded in parallel processes (default **0**, autodetect).

**--threads** _N_
> ONNX threads per worker (default **0**, autodetect).

**--keep-audio**
> Keep the extracted audio file after transcribing a URL.

**--model** _DIR_
> Override the model directory; falls back to the **KROKO_MODEL** environment variable, then to the cached default.

**--help**
> Show the full option list and exit.

# DESCRIPTION

**yapsnap** is a single-command speech-to-text tool that transcribes audio from local files or remote video URLs into plaintext. It runs entirely on CPU using streaming **Zipformer** transducers (Kroko) via **sherpa-onnx**. By default a small whisper-tiny language-ID head detects the spoken language from two 5-second samples and downloads the matching ~80 MB model once, after which it operates fully offline with no API keys and no audio leaving the machine. Optional **--diarize** adds speaker labels, also CPU-only.

URL inputs are fetched with **yt-dlp** and decoded with **ffmpeg**, so anything those tools can handle (YouTube, YouTube Shorts, X/Twitter, TikTok, Instagram Reels, direct media URLs) is fair game. Local files cover the common containers and codecs (**mp3**, **mp4**, **m4a**, **wav**, **webm**, **mov**, **mkv**, ...).

By default the audio is sped up by 1.4x (pitch-preserved) before transcription, which keeps quality usable while shrinking wall-clock time well below real time on a laptop. Output is a single paragraph of plain text; **--timestamps** switches to a per-sentence layout.

# CAVEATS

Requires **ffmpeg** on **PATH**; the installer does not bundle it. Each model is single-language, so a bilingual recording is transcribed in whichever language is detected; language detection can fall back to English on silent or noisy audio (pin it with **--lang**). Diarization does not model overlapping speech and weakens past about seven speakers. Models are cached under **~/.cache/yapsnap/** on Linux. Accuracy depends on input clarity: noisy audio, heavy accents, or overlapping speakers degrade output. The first run blocks on a one-time model download. If a URL suddenly fails, update **yt-dlp** (**pip install -U yt-dlp**).

# HISTORY

**yapsnap** was released in **2026** by GitHub user **kouhxp** as a minimal, local-first alternative to cloud speech-to-text APIs, built around the open **Kroko** Zipformer models. It is written in **Python** and licensed under Apache-2.0.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [ffmpeg](/man/ffmpeg)(1), [whisper](/man/whisper)(1)

# RESOURCES

```[Source code](https://github.com/kouhxp/yapsnap)```

<!-- verified: 2026-11-23 -->
