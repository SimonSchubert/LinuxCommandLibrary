# TAGLINE

AI-powered speech recognition and transcription

# TLDR

**Transcribe audio file**

```whisper [audio.mp3]```

**Transcribe with specific model**

```whisper --model [medium] [audio.mp3]```

**Transcribe with language hint**

```whisper --language [en] [audio.mp3]```

**Output specific format**

```whisper --output_format [srt] [audio.mp3]```

**Translate to English**

```whisper --task [translate] [audio.mp3]```

**Output to specific directory**

```whisper --output_dir [/path/to/output] [audio.mp3]```

**Transcribe multiple files**

```whisper [audio1.mp3] [audio2.wav]```

**Use GPU with float16**

```whisper --device [cuda] --fp16 [audio.mp3]```

# SYNOPSIS

**whisper** [_--model size_] [_--language lang_] [_--task task_] [_--output_format fmt_] [_options_] _files_

# PARAMETERS

**--model** _SIZE_
> Model size: tiny, base, small, medium, large.

**--language** _LANG_
> Language code (en, de, fr, etc.) or auto.

**--task** _TASK_
> Task: transcribe or translate.

**--output_format** _FORMAT_
> Output format: txt, vtt, srt, tsv, json, all.

**--output_dir** _DIR_
> Output directory.

**--device** _DEVICE_
> Device: cpu, cuda.

**--fp16** / **--no-fp16**
> Use float16 (GPU) or float32.

**--temperature** _TEMP_
> Sampling temperature.

**--best_of** _NUM_
> Number of candidates.

**--beam_size** _NUM_
> Beam search size.

**--word_timestamps** _BOOL_
> Include word-level timestamps.

**--condition_on_previous_text** _BOOL_
> Use previous output as context.

**--verbose** _BOOL_
> Show progress and transcription.

**--threads** _NUM_
> CPU threads.

# DESCRIPTION

**Whisper** is OpenAI's automatic speech recognition (ASR) system. It transcribes audio in many languages and can translate to English.

Model sizes trade accuracy for speed: tiny runs fastest, large is most accurate. The .en suffix (tiny.en, base.en) denotes English-only models, slightly better for English.

Language detection is automatic but can be hinted. For non-English audio, specifying the language improves accuracy. Translation mode transcribes any language to English text.

Output formats include plain text, subtitles (SRT, VTT), and JSON with timing data. Word-level timestamps enable karaoke-style highlighting.

Processing uses GPU (CUDA) when available, significantly faster than CPU. The --fp16 flag enables half-precision math on compatible GPUs.

Audio preprocessing handles various formats via FFmpeg. Long files are processed in segments with context maintained across segments.

# CAVEATS

Large models require significant VRAM (10GB+ for large). CPU inference is slow. Accuracy varies by audio quality and accent. Hallucinations possible on silent or noisy segments. No speaker diarization. Model download required on first use.

# HISTORY

**Whisper** was released by **OpenAI** in **September 2022**. Trained on 680,000 hours of multilingual audio, it achieved near-human transcription accuracy. The open-source release enabled local deployment, spawning community projects and integrations.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [vosk](/man/vosk)(1), [deepspeech](/man/deepspeech)(1)
