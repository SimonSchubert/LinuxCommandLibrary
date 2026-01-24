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

**tts** synthesizes speech. It's Coqui TTS CLI.

Neural TTS. Deep learning synthesis.

Multiple models. Various voices.

Multi-speaker. Voice selection.

High quality. Natural sounding.

# CAVEATS

Python required. Large model downloads. GPU recommended.

# HISTORY

**TTS** (Coqui TTS) is an open-source deep learning text-to-speech toolkit with multiple models.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [piper](/man/piper)(1)
