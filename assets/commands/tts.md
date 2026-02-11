# TAGLINE

Neural text-to-speech synthesis

# TLDR

**Synthesize speech**

```tts --text "[Hello world]"```

**Save to file**

```tts --text "[Hello]" --out_path [output.wav]```

**List models**

```tts --list_models```

**Use specific model**

```tts --text "[text]" --model_name [tts_models/en/ljspeech/tacotron2-DDC]```

**List speakers**

```tts --model_name [model] --list_speakers```

# SYNOPSIS

**tts** [_--text text_] [_--out_path file_] [_--model_name model_] [_options_]

# PARAMETERS

**--text** _TEXT_
> Input text.

**--out_path** _FILE_
> Output audio file.

**--model_name** _MODEL_
> TTS model.

**--list_models**
> Show models.

**--speaker_idx** _ID_
> Speaker selection.

# DESCRIPTION

**tts** is the command-line interface for Coqui TTS, an open-source deep learning text-to-speech toolkit. It converts text input into natural-sounding speech audio using neural network models, supporting multiple languages and voice styles.

The tool ships with a variety of pre-trained models that can be listed and selected by name. Multi-speaker models allow choosing between different voice characteristics via speaker indices. Audio output can be saved to WAV files or played directly.

Models are downloaded automatically on first use and cached locally. While CPU inference is supported, a GPU is recommended for faster synthesis, especially with larger models.

# CAVEATS

Python required. Large model downloads. GPU recommended.

# HISTORY

**TTS** (Coqui TTS) is an open-source deep learning text-to-speech toolkit with multiple models.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [piper](/man/piper)(1)
