# TAGLINE

Offline speech recognition toolkit

# TLDR

**Transcribe audio to text file**

```vosk-transcriber -i [audio.mp4] -o [output.txt]```

**Generate SRT subtitles**

```vosk-transcriber -i [video.mp4] -t srt -o [subtitles.srt]```

**Transcribe in specific language**

```vosk-transcriber -l [fr] -i [audio.m4a] -o [output.txt]```

**List available languages**

```vosk-transcriber --list-languages```

**List available models**

```vosk-transcriber --list-models```

**Transcribe with a local model**

```vosk-transcriber -m [path/to/model] -i [audio.wav] -o [output.txt]```

**Transcribe a folder** to subtitles

```vosk-transcriber -i [input_dir] -o [output_dir] -t srt```

# SYNOPSIS

**vosk-transcriber** [_options_] -i _input_ [-o _output_]

# PARAMETERS

**-i**, **--input** _path_
> Input audio or video file, or a directory of files.

**-o**, **--output** _path_
> Output file, or output directory when the input is a directory.

**-t**, **--output-type** _format_
> Output format: txt (default), srt or json.

**-l**, **--lang** _lang_
> Select model by language. Default en-us.

**-m**, **--model** _path_
> Use a local model directory.

**-n**, **--model-name** _name_
> Select model by name.

**--list-languages**
> List available languages.

**--list-models**
> List available models.

**-s**, **--server** _url_
> Use a recognition server, for example ws://localhost:2700.

**-ts**, **--tasks** _N_
> Number of parallel recognition tasks. Default 10.

**--log-level** _level_
> Logging level. Default INFO.

# DESCRIPTION

**vosk** is an offline speech recognition toolkit supporting 20+ languages including English, German, French, Spanish, Chinese, Russian, and many others. It provides automatic speech recognition without requiring internet connectivity.

The vosk-transcriber CLI processes audio and video files, automatically downloading appropriate language models on first use. Output formats are plain text, SRT subtitles with timestamps, and JSON. Recognition can also be delegated to a separate Vosk server over WebSocket with **--server**.

Models range from small (50MB) for mobile/embedded use to large models for maximum accuracy. The underlying engine supports continuous transcription, speaker identification, and vocabulary customization.

# CAVEATS

First run downloads language model (50MB-1GB depending on language and size). Requires Python 3 and ffmpeg, which decodes the input. Recognition accuracy varies by model size and audio quality. Some languages have limited model options.

# HISTORY

**Vosk** was developed by Alpha Cephei as an open-source offline speech recognition solution. Built on Kaldi ASR technology, it provides lightweight models suitable for mobile and embedded devices. The project gained popularity as an alternative to cloud-based recognition services, offering privacy and offline capability.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [whisper](/man/whisper)(1), [sox](/man/sox)(1)

# RESOURCES

```[Homepage](https://alphacephei.com/vosk/)```

```[Source code](https://github.com/alphacep/vosk-api)```

<!-- verified: 2026-11-09 -->
