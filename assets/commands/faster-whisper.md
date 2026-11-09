# TAGLINE

command-line wrapper for the faster-whisper speech recognition engine

# TLDR

**Transcribe an audio file** to an SRT next to it

```faster-whisper [audio.mp3]```

**Transcribe with a specific model**

```faster-whisper [audio.mp3] --model_size_or_path [medium]```

**Transcribe with language hint**

```faster-whisper [audio.mp3] --language [en]```

**Write to a specific SRT file**

```faster-whisper [audio.mp3] -o [output.srt]```

**Translate to English**

```faster-whisper [audio.mp3] --task translate```

**Use the GPU**

```faster-whisper [audio.mp3] --device cuda --compute_type [float16]```

**Skip silence** using the VAD filter

```faster-whisper [audio.mp3] --vad_filter True```

# SYNOPSIS

**faster-whisper** _audio_ [**-o** _output_] [**--model_size_or_path** _model_] [**--language** _lang_] [**--task** _task_] [_options_]

# PARAMETERS

_AUDIO_
> Path to the input audio file.

**-o**, **--output** _FILE_
> Output .srt file (default: the input name with a .srt extension).

**--model_size_or_path** _MODEL_
> Model size (tiny, base, small, medium, their .en variants, large-v1, large-v2) or a path to a converted model directory (default: base).

**--language** _LANG_
> Language spoken in the audio (default: detected).

**--task** _TASK_
> Task: transcribe or translate (default: transcribe).

**--device** _DEVICE_
> Device: cpu, cuda, or auto (default: auto).

**--device_index** _N_...
> GPU device IDs to use.

**--compute_type** _TYPE_
> Computation type as defined by CTranslate2, such as int8, float16 or float32.

**--cpu_threads** _N_
> Number of CPU threads (default: 4).

**--num_workers** _N_
> Number of workers (default: 1).

**--download_root** _DIR_
> Directory where models are saved (default: the Hugging Face cache).

**--local_files_only** _BOOL_
> Do not download models, use only cached files.

**--beam_size** _N_
> Beam search size (default: 5).

**--best_of** _N_
> Number of candidates when sampling (default: 5).

**--temperature** _T_...
> Temperatures for sampling.

**--initial_prompt** _TEXT_
> Text to provide as a prompt for the first window.

**--condition_on_previous_text** _BOOL_
> Provide previous output as a prompt for the next window.

**--no_speech_threshold** _N_
> Threshold for treating a segment as silent (default: 0.6).

**--vad_filter** _BOOL_
> Filter out audio without speech using the Silero VAD model.

# DESCRIPTION

**faster-whisper** on the command line comes from the **faster-whisper-cli** package, a thin wrapper that generates an SRT subtitle file from an audio file. It uses the **faster-whisper** library, a reimplementation of OpenAI's Whisper on **CTranslate2** that is up to 4x faster than the original at the same accuracy while using less memory.

Larger models are more accurate but slower. Models are downloaded from the Hugging Face Hub on first use. Voice activity detection (VAD) filtering skips silent sections. Specifying the language avoids detection overhead.

# CAVEATS

The upstream faster-whisper project is a Python library and ships no command-line tool; **faster-whisper-cli** is a separate third-party package, last released in May 2023. It only writes SRT, with timestamps as plain seconds rather than standard SRT timecodes, and has no **--model**, **--output_format** or **--output_dir** options. Boolean options use Python's bool parsing, so any non-empty value such as **False** counts as true. GPU execution requires the NVIDIA CUDA libraries. For an OpenAI Whisper compatible CLI with more output formats, use **whisper-ctranslate2**.

# HISTORY

The **faster-whisper** library was created by **Guillaume Klein** at **SYSTRAN** in **2023**. The faster-whisper-cli wrapper was published to PyPI in May 2023.

# SEE ALSO

[whisper](/man/whisper)(1), [deepspeech](/man/deepspeech)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/SYSTRAN/faster-whisper)```

<!-- verified: 2026-11-09 -->
