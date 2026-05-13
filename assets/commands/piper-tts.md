# TAGLINE

Fast local neural text-to-speech CLI

# TLDR

**Download** a voice model

```python3 -m piper.download_voices [en_US-lessac-medium]```

**Synthesize** text from stdin to a WAV file

```echo "[Hello world.]" | piper --model [en_US-lessac-medium] --output-file [out.wav]```

**Synthesize** text given inline

```piper --model [en_US-lessac-medium] --output-file [greeting.wav] -- "[This is a test.]"```

**Stream raw audio** straight to a player

```echo "[Hi there.]" | piper --model [en_US-lessac-medium] --output-raw | aplay -r [22050] -f S16_LE -t raw -```

**Select a speaker** in a multi-speaker model

```piper --model [de_DE-thorsten-medium] --speaker [0] --output-file [de.wav] -- "[Guten Tag.]"```

**Use GPU** acceleration

```piper --model [en_US-lessac-medium] --cuda --output-file [gpu.wav] -- "[Running on GPU.]"```

# SYNOPSIS

**piper** **--model** _voice_ [**--output-file** _file_ | **--output-raw**] [_options_]

# PARAMETERS

**-m**, **--model** _voice_
> Voice model identifier (e.g. _en_US-lessac-medium_) or path to an ONNX file.

**-f**, **--output-file** _file_
> Write the synthesized WAV audio to _file_.

**--output-raw**
> Write raw 16-bit PCM audio to stdout (for piping into a player).

**--input-file** _file_
> Read input text from _file_ instead of stdin.

**--data-dir** _dir_
> Directory where downloaded voice files are stored.

**--speaker** _n_
> Select speaker index for multi-speaker voices.

**--sentence-silence** _seconds_
> Seconds of silence inserted between sentences.

**--volume** _factor_
> Output volume multiplier (1.0 is unchanged).

**--cuda**
> Use the CUDA execution provider (requires onnxruntime-gpu).

**--json-input**
> Read JSON objects from stdin instead of plain text.

# DESCRIPTION

**piper** is an offline neural text-to-speech engine that runs VITS voice models exported to ONNX. Installing the **piper-tts** Python package provides the **piper** binary, which reads text from standard input (or the file given by **--input-file**) and writes 16-bit PCM WAV audio either to a file or to standard output for streaming.

Voices are distributed separately and downloaded with **python3 -m piper.download_voices**. Models cover many languages and accents, and several are multi-speaker — use **--speaker** to pick a voice. Phonemization is performed via embedded **espeak-ng**, and inline overrides written in double brackets (for example `[[ bˈætmæn ]]`) are accepted for fine-grained pronunciation control.

Output quality and latency depend on the model variant (_x_low_, _low_, _medium_, _high_). For interactive use, piper is typically wrapped behind a daemon so the model is loaded once instead of on every invocation.

# CAVEATS

Loading the ONNX model has noticeable startup cost; for low-latency applications run piper as a streaming service rather than per-sentence. Output sample rate is fixed by the chosen voice (commonly 22050 Hz) and must match the player's settings when using **--output-raw**. Voice models carry their own licenses.

# HISTORY

**piper** was created by **Michael Hansen** in **November 2022** under the **Rhasspy** umbrella for use in offline voice assistants and is now developed at **Nabu Casa / Open Home Foundation** as the GPL-3.0 **piper1-gpl** project. It powers TTS in **Home Assistant**, the **NVDA** screen reader, and **LocalAI**.

# SEE ALSO

[espeak-ng](/man/espeak-ng)(1), [festival](/man/festival)(1), [flite](/man/flite)(1)
