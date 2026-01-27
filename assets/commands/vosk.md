# TLDR

**Transcribe audio to text file**

```vosk-transcriber -i [audio.mp4] -o [output.txt]```

**Generate SRT subtitles**

```vosk-transcriber -i [video.mp4] -t srt -o [subtitles.srt]```

**Transcribe in specific language**

```vosk-transcriber -l [fr] -i [audio.m4a] -o [output.txt]```

**List available languages**

```vosk-transcriber --list-languages```

**Transcribe from microphone (vosk-cli)**

```vosk mic -o [output.txt] -t english```

**Transcribe audio file (vosk-cli)**

```vosk rec -c english [audio.mp3]```

# SYNOPSIS

**vosk-transcriber** [_options_] -i _input_ -o _output_

**vosk** _command_ [_options_]

# PARAMETERS

**-i** _file_
> Input audio or video file.

**-o** _file_
> Output file for transcription.

**-t** _format_
> Output format: txt, srt, vtt.

**-l** _lang_
> Language code (en, fr, de, es, ru, etc.).

**--list-languages**
> Show available language models.

**--model** _path_
> Use custom model directory.

**--show-words**
> Include word-level timestamps.

**--server**
> Start WebSocket recognition server.

# DESCRIPTION

**vosk** is an offline speech recognition toolkit supporting 20+ languages including English, German, French, Spanish, Chinese, Russian, and many others. It provides automatic speech recognition without requiring internet connectivity.

The vosk-transcriber CLI processes audio and video files, automatically downloading appropriate language models on first use. Output formats include plain text and subtitle formats (SRT, VTT) with timestamps. The toolkit can also run as a WebSocket server for real-time streaming recognition.

Models range from small (50MB) for mobile/embedded use to large models for maximum accuracy. The underlying engine supports continuous transcription, speaker identification, and vocabulary customization.

# CAVEATS

First run downloads language model (50MB-1GB depending on language and size). Requires Python 3.6+ and ffmpeg for video processing. Recognition accuracy varies by model size and audio quality. Some languages have limited model options.

# HISTORY

**Vosk** was developed by Alpha Cephei as an open-source offline speech recognition solution. Built on Kaldi ASR technology, it provides lightweight models suitable for mobile and embedded devices. The project gained popularity as an alternative to cloud-based recognition services, offering privacy and offline capability.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [whisper](/man/whisper)(1), [sox](/man/sox)(1)
