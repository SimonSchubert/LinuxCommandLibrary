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

```whisper --model medium --task translate [audio.mp3]```

**Output to specific directory**

```whisper --output_dir [/path/to/output] [audio.mp3]```

**Transcribe multiple files**

```whisper [audio1.mp3] [audio2.wav]```

**Force CPU inference**

```whisper --device cpu [audio.mp3]```

**Word-level timing** with highlighted words in subtitles

```whisper --word_timestamps True --highlight_words True --output_format srt [audio.mp3]```

# SYNOPSIS

**whisper** [_--model size_] [_--language lang_] [_--task task_] [_--output_format fmt_] [_options_] _files_

# PARAMETERS

**--model** _SIZE_
> Model size: tiny, base, small, medium, large, turbo (default: turbo). English-only variants: tiny.en, base.en, small.en, medium.en. Specific versions: large-v1, large-v2, large-v3, large-v3-turbo.

**--language** _LANG_
> Language code or name (en, de, Japanese, etc.). Omit to detect the language automatically.

**--task** _TASK_
> Task: transcribe (default) or translate (into English).

**-f**, **--output_format** _FORMAT_
> Output format: txt, vtt, srt, tsv, json, jsonl, all (default: all).

**-o**, **--output_dir** _DIR_
> Output directory (default: current directory).

**--device** _DEVICE_
> PyTorch device, such as cpu or cuda (default: cuda if available, else cpu).

**--fp16** _BOOL_
> Perform inference in FP16 (default: True). Falls back to FP32 on CPU.

**--temperature** _TEMP_
> Sampling temperature (default: 0).

**--best_of** _NUM_
> Number of candidates when sampling with non-zero temperature (default: 5).

**--beam_size** _NUM_
> Number of beams in beam search, used when temperature is zero (default: 5).

**--word_timestamps** _BOOL_
> Extract word-level timestamps (experimental, default: False).

**--highlight_words** _BOOL_
> Underline each word as it is spoken in srt and vtt output (requires --word_timestamps True).

**--max_line_width** _NUM_
> Maximum characters per line before breaking (requires --word_timestamps True).

**--max_line_count** _NUM_
> Maximum lines per segment (requires --word_timestamps True).

**--max_words_per_line** _NUM_
> Maximum words per segment (requires --word_timestamps True, no effect with --max_line_width).

**--hallucination_silence_threshold** _SECONDS_
> Skip silent periods longer than this when a possible hallucination is detected (requires --word_timestamps True).

**--condition_on_previous_text** _BOOL_
> Use previous output as context for the next window (default: True).

**--verbose** _BOOL_
> Show progress and transcription (default: True).

**--threads** _NUM_
> Number of threads used by torch for CPU inference.

**--model_dir** _DIR_
> Directory to save and load models (default: ~/.cache/whisper).

**--initial_prompt** _TEXT_
> Optional text to provide as prompt for the first window.

**--clip_timestamps** _TIMESTAMPS_
> Comma-separated start,end,start,end,... timestamps in seconds of the clips to process.

# DESCRIPTION

**Whisper** is OpenAI's automatic speech recognition (ASR) system. It transcribes audio in many languages and can translate to English.

Model sizes trade accuracy for speed: tiny runs fastest, large is most accurate. The turbo model (default) offers a good balance, running ~8x faster than large with minor quality loss. The .en suffix (tiny.en, base.en) denotes English-only models, slightly better for English. The turbo model is not trained for translation and returns the original language even with --task translate; use medium or large instead.

Language detection is automatic but can be hinted. For non-English audio, specifying the language improves accuracy. Translation mode transcribes any language to English text.

Output formats include plain text, subtitles (SRT, VTT), and JSON with timing data. Word-level timestamps enable karaoke-style highlighting.

Processing uses GPU (CUDA) when available, significantly faster than CPU. FP16 half-precision is on by default and falls back to FP32 on CPU.

Audio preprocessing handles various formats via FFmpeg. Long files are processed in segments with context maintained across segments.

# CAVEATS

Requires the ffmpeg command-line tool. Large models require significant VRAM (about 10 GB for large, 6 GB for turbo). CPU inference is slow. Accuracy varies by audio quality and accent. Hallucinations possible on silent or noisy segments. No speaker diarization. Model download required on first use.

# HISTORY

**Whisper** was released by **OpenAI** in **September 2022**. Trained on 680,000 hours of multilingual audio, it achieved near-human transcription accuracy. The open-source release enabled local deployment, spawning community projects and integrations. The large-v3-turbo model was added in September 2024, offering significantly faster inference with minimal quality loss.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [vosk](/man/vosk)(1), [deepspeech](/man/deepspeech)(1)

# RESOURCES

```[Source code](https://github.com/openai/whisper)```

<!-- verified: 2026-11-09 -->
