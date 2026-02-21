# TAGLINE

optimized Whisper speech recognition engine

# TLDR

**Transcribe an audio file**

```faster-whisper [audio.mp3]```

**Transcribe with a specific model**

```faster-whisper [audio.mp3] --model [large-v3]```

**Transcribe with language hint**

```faster-whisper [audio.mp3] --language [en]```

**Output as SRT subtitles**

```faster-whisper [audio.mp3] --output_format [srt]```

**Translate to English**

```faster-whisper [audio.mp3] --task [translate]```

**Save output to directory**

```faster-whisper [audio.mp3] --output_dir [/path/to/output]```

**Transcribe with word timestamps**

```faster-whisper [audio.mp3] --word_timestamps [true]```

# SYNOPSIS

**faster-whisper** _audio_ [_--model size_] [_--language lang_] [_--task task_] [_options_]

# PARAMETERS

**--model** _SIZE_
> Model size: tiny, base, small, medium, large-v1, large-v2, large-v3 (default: small).

**--language** _LANG_
> Language code (en, de, fr, etc.) or auto-detect.

**--task** _TASK_
> Task: transcribe or translate.

**--output_format** _FORMAT_
> Output format: txt, vtt, srt, tsv, json, all.

**--output_dir** _DIR_
> Output directory for results.

**--word_timestamps** _BOOL_
> Include word-level timestamps.

**--device** _DEVICE_
> Device: cpu, cuda, auto (default: auto).

**--compute_type** _TYPE_
> Compute type: int8, float16, float32 (default: int8 on CPU).

**--beam_size** _N_
> Beam search size (default: 5).

**--vad_filter** _BOOL_
> Enable voice activity detection filter.

**--threads** _N_
> Number of CPU threads.

# DESCRIPTION

**faster-whisper** is a reimplementation of OpenAI's Whisper using **CTranslate2**, a fast inference engine for Transformer models. It provides up to 4x faster transcription than the original Whisper while using less memory.

The tool supports all Whisper model sizes. Larger models are more accurate but slower. The compute type parameter controls precision: int8 is fastest and most memory-efficient, float16 is a good balance on GPU, float32 is highest precision.

Voice activity detection (VAD) filtering skips silent sections, improving both speed and accuracy. Language detection is automatic but specifying the language avoids detection overhead.

The base library is installed via `pip install faster-whisper` (Python API only). For CLI usage, install a wrapper such as `pip install faster-whisper-cli` or `pip install whisper-ctranslate2`. CTranslate2 handles model conversion automatically. GPU acceleration requires CUDA toolkit.

# CAVEATS

Large models require significant memory. CUDA toolkit needed for GPU. First run downloads and converts models. Accuracy varies by audio quality. No speaker diarization in CLI (available via API).

# HISTORY

**faster-whisper** was created by **Guillaume Klein** (SYSTRAN) in **2023** using CTranslate2 to optimize Whisper inference. It became the preferred Whisper implementation for production use due to its speed and memory advantages. The project achieved wide adoption in transcription workflows.

# SEE ALSO

[whisper](/man/whisper)(1), [deepspeech](/man/deepspeech)(1), [ffmpeg](/man/ffmpeg)(1)
