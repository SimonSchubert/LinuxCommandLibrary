# TLDR

**Generate speech from text**

```python -m bark --text "[Hello, how are you?]" --output_filename [output.wav]```

**Use a specific speaker preset**

```python -m bark --text "[Hello]" --output_filename [output.wav] --history_prompt [v2/en_speaker_6]```

**Generate with emotions/effects**

```python -m bark --text "[laughs] Oh that's funny! [sighs]" --output_filename [output.wav]```

**Generate in another language**

```python -m bark --text "[Bonjour le monde]" --output_filename [output.wav] --history_prompt [v2/fr_speaker_1]```

**Generate with music notation**

```python -m bark --text "[♪ La la la ♪]" --output_filename [output.wav]```

# SYNOPSIS

**python** **-m** **bark** **--text** _text_ **--output_filename** _file_ [_options_]

# PARAMETERS

**--text** _TEXT_
> Input text to synthesize.

**--output_filename** _FILE_
> Output audio file path (.wav).

**--history_prompt** _PRESET_
> Speaker voice preset (e.g., v2/en_speaker_0 through v2/en_speaker_9).

**--text_temp** _FLOAT_
> Text generation temperature (default: 0.7).

**--waveform_temp** _FLOAT_
> Waveform generation temperature (default: 0.7).

# DESCRIPTION

**Bark** is a transformer-based text-to-audio model by **Suno AI**. Unlike traditional TTS, Bark generates highly expressive speech including laughter, sighs, breathing, crying, and even music.

Special tokens in the text control non-speech sounds: `[laughs]`, `[sighs]`, `[gasps]`, `[clears throat]`, and `[music]`. Musical notation with `♪` symbols can generate singing. Capitalizing words adds emphasis, and `...` adds hesitation.

Speaker presets select voice characteristics. Presets are available for multiple languages: English, German, Spanish, French, Hindi, Italian, Japanese, Korean, Polish, Portuguese, Russian, Turkish, and Chinese.

Install with `pip install suno-bark`. Models are downloaded automatically on first use. GPU (CUDA) is strongly recommended for reasonable generation speed.

# CAVEATS

Slow on CPU (GPU strongly recommended). Large model downloads (~5GB). Output quality varies. Long text should be split into sentences. Not suitable for real-time synthesis. May produce unexpected audio artifacts.

# HISTORY

**Bark** was released by **Suno AI** in **April 2023** as an open-source text-to-audio model. Its ability to generate expressive speech with emotions and non-verbal sounds set it apart from conventional TTS systems. The model quickly gained popularity for creative audio generation.

# SEE ALSO

[piper](/man/piper)(1), [tts](/man/tts)(1), [espeak](/man/espeak)(1)
