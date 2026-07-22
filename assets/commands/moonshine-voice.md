# TAGLINE

On-device speech recognition, intent matching, and text-to-speech

# TLDR

**Install** the Python package (adds the CLI)

```pip install moonshine-voice```

**Transcribe live microphone** input to the terminal

```moonshine-voice mic --language [en]```

**Transcribe a WAV file** (optional speaker IDs and word timestamps)

```moonshine-voice transcribe --wav-path [audio.wav] --speaker-ids --word-timestamps```

**Synthesize speech** and play it (or write a WAV)

```moonshine-voice tts --language [en_us] --text ["Hello world"]```

**Clone a voice** from a short reference clip, then speak text

```moonshine-voice tts --clone [reference.wav] --text ["This is my cloned voice"]```

**Recognize spoken intents** from the microphone

```moonshine-voice intent --intents ["turn on the lights,turn off the lights,what is the weather"]```

**Download model assets** (STT, TTS, G2P, or intent)

```moonshine-voice download --stt --language [en]```

**Convert text to IPA phonemes** with the built-in G2P engine

```moonshine-voice g2p --language [en_us] --text ["Hello world"]```

# SYNOPSIS

**moonshine-voice** _command_ [_options_]

**moonshine-voice** {**mic** | **transcribe** | **tts** | **intent** | **download** | **g2p**} [_options_]

# DESCRIPTION

**moonshine-voice** is the command-line front end for **Moonshine Voice**, an open-source on-device toolkit for live speech interfaces. The same package ships a Python library and a portable C++ core; installing via **pip** registers **moonshine-voice** (and a shorter **moonshine** alias) as a thin dispatcher over the built-in demo modules.

All processing can run fully offline after models are cached. Streaming STT models use flexible input windows and incremental caching so partial transcripts update while the user is still talking, targeting lower latency than fixed 30-second Whisper-style windows for live mic use. The stack also covers semantic **intent** matching, multi-engine **TTS** (Kokoro, Piper, and ZipVoice with optional voice cloning), and a MIT-licensed grapheme-to-phoneme (**G2P**) path used by synthesis.

STT languages include English, Spanish, Mandarin, Japanese, Korean, Vietnamese, Ukrainian, and Arabic (language-specific models). TTS covers a wider set of locales via Kokoro/Piper/ZipVoice voice packs. The project also publishes microcontroller-oriented **Moonshine Micro** builds (VAD/STT/TTS under ~500 KiB RAM) separate from this CLI.

# COMMANDS

**mic**

> Stream audio from the default microphone and print live transcript updates to the terminal.

**transcribe**

> Transcribe a WAV file offline. Supports speaker diarization (**--speaker-ids**) and word-level timestamps (**--word-timestamps**).

**tts**

> Synthesize speech from text to a WAV file or the default audio device. Optional ZipVoice cloning via **--clone**.

**intent**

> Listen for user-defined action phrases (comma-separated) and report semantic matches with confidence.

**download**

> Prefetch STT, TTS, G2P, or intent/embedding model assets into the local cache (or a custom **--root**).

**g2p**

> Convert input text to International Phonetic Alphabet (IPA) using Moonshine's G2P engine.

# PARAMETERS

Common top-level options:

**-h**, **--help**

> Show usage and the list of subcommands.

**-V**, **--version**

> Print the installed **moonshine-voice** package version.

Subcommand flags (most used):

**mic** / **intent**: **--language** _code_ (default **en**), **--model-arch** _n_

**transcribe**: **--wav-path** _file_, **--language** _code_, **--model-path** _dir_, **--speaker-ids**, **--word-timestamps**, **--quiet**, **--options** _key=value,..._

**tts**: **--language** _tag_ (default **en_us**), **--text** _string_, **--voice** _id_, **--clone** _wav_, **--clone-transcript** _text_, **--out** _path_, **--device** _index_or_name_, **--asset-root** _path_, **--options** _KEY=VALUE_

**download**: **--stt**, **--tts**, **--g2p**, **--intent**, **--language** _tag_, **--voice** _id_, **--root** _dir_ (at least one of **--stt** / **--tts** / **--g2p** / **--intent** is required)

**g2p**: **-l** / **--language** _tag_, **--text** _string_, **--asset-root** _path_, **--no-download**

**intent**: **--intents** _comma-list_, **--threshold** _float_ (default **0.8**), **--wav-file** _path_, **--embedding-model** _name_, **--quantization** {_fp32_ | _fp16_ | _q8_ | _q4_ | _q4f16_}

Each subcommand also accepts **--help** for its full flag list. Invoking **python -m moonshine_voice.**_module_ with the same flags is equivalent.

# CAVEATS

First-run model downloads need network access to **download.moonshine.ai** (or Hugging Face mirrors used by the package); after that, inference can be offline if assets are cached. Live mic modes need a working capture device and appropriate OS audio permissions. On Raspberry Pi OS, installing system-wide often requires **pip install --break-system-packages** (or a virtualenv). **--clone** TTS uses ZipVoice and is slower than Kokoro/Piper. The **moonshine** short name is only an alias for the same entry point, not a separate tool.

# HISTORY

Moonshine's first-generation models were released with the paper *Moonshine: Speech Recognition for Live Transcription and Voice Commands* (arXiv:2410.15608). Later work added language-specific "Flavors of Moonshine" models and a second generation aimed at streaming latency and edge accuracy, culminating in the **Moonshine Voice** multi-platform library and **moonshine-voice** pip package (Python console scripts plus C++/Swift/Android bindings). The project is developed by **Moonshine AI** under the MIT License.

# INSTALL

```aur: yay -S moonshine```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[whisper](/man/whisper)(1), [faster-whisper](/man/faster-whisper)(1), [piper](/man/piper)(1), [tts](/man/tts)(1), [deepspeech](/man/deepspeech)(1)

# RESOURCES

```[Source code](https://github.com/moonshine-ai/moonshine)```

```[Homepage](https://moonshine.ai)```

```[Documentation](https://github.com/moonshine-ai/moonshine#readme)```

<!-- verified: 2026-07-18 -->
