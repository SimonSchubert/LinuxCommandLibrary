# TAGLINE

Local multi-modal AI inference runtime and CLI

# TLDR

**Inspect** the machine and list recommended models

```mere.run setup```

```mere.run model capabilities --recommended```

**Pull** a small image model and **generate** an image

```mere.run model pull image-zimage-nano```

```mere.run image generate --model image-zimage-nano --prompt "[a ceramic mug in soft morning light]" --output [./mug.png]```

**Chat** with a local text model

```mere.run text chat --model [text-chat-gemma4-12b-4bit] --prompt "[Explain unified memory.]"```

**Synthesize speech** to a WAV file

```mere.run speech synthesize "[Hello from mere.run]" --output [./hello.wav]```

**Serve** an OpenAI-compatible local API on loopback

```mere.run api serve --engine [text-chat-gemma4]```

**List** installed models and runtime status

```mere.run model list```

```mere.run status```

# SYNOPSIS

**mere.run** [_global-options_] _command_ [_subcommand_] [_options_] [_args_...]

# PARAMETERS

**setup**
> Guided first-run setup for the local runtime and model store.

**guide** [_command-path_]
> Read packaged offline cookbooks for a command path; use **guide --list** to list them.

**model** {_list_, _pull_, _remove_, _info_, _capabilities_, _runtime_, _benchmark_, ...}
> Manage the local model store: pull by managed ID, inspect install status, and report what the machine can run.

**image** {_generate_, _train-lora_, _run-plan_, _validate_, ...}
> Local image generation, LoRA training, and related image workflows.

**text** {_chat_, _code_, _embed_, _anonymize_, _train-lora_}
> Local chat, code generation (llama.cpp), embeddings, and PII redaction.

**speech** {_synthesize_, _transcribe_, _diarize_, _listen_, _profile_}
> Text-to-speech, ASR, diarization, and voice profiles.

**vision** {_caption_, _inspect_, _face_, _ground_, _segment_, _track_, _pose_, _ocr_, ...}
> Captioning, VQA, face analysis, grounding, segmentation, tracking, pose, and OCR.

**music** {_analyze_, _generate_, _realtime_, _transcribe_}
> Music generation, analysis, realtime performance, and MIDI transcription.

**sfx** {_generate_, _video_, _ae_, _clap_, ...}
> Sound-effect generation, including video-conditioned Foley.

**video** {_generate_, _animate_, _prepare-masks_, _session_, ...}
> Local video generation and subject animation pipelines.

**api serve**
> Serve OpenAI-compatible chat, embeddings, images, TTS, and STT on a local host/port.

**status**
> Show local server, served model, model-store path, and installed models.

**plugin** {_list_, _info_, _install_, _doctor_}
> Discover and manage companion plugin executables.

**--models-root** _path_
> Override the local model store directory for this invocation.

**--help**
> Show the public command tree or help for a group/subcommand.

# DESCRIPTION

**mere.run** is a local-first inference runtime and public CLI for multi-modal generation and understanding. One command covers image, text, speech, vision, music, sound, video, 3D-related reconstruction helpers, model management, and an optional OpenAI-compatible API server. The optional macOS Studio app uses the same CLI, model store, and run history rather than a separate backend.

The CLI is modality-first: creative and analysis work lives under groups such as **image**, **text**, **speech**, **vision**, **music**, **sfx**, and **video**, while **model**, **adapter**, **api**, **status**, and **plugin** handle operations. Managed model IDs are pulled into a local store (by default under Application Support on macOS); use **model capabilities** before large downloads. Packaged offline cookbooks are available via **mere.run guide**.

Primary development targets Apple Silicon macOS; headless Linux CLI packages are supported for the runtime without the macOS SwiftUI studio. Media workflows typically expect **ffmpeg** and **ffprobe** on **PATH** (overridable with **MERERUN_FFMPEG** / **MERERUN_FFPROBE**).

# CONFIGURATION

**~/Library/Application Support/MereRun/models**
> Default local model store on macOS. Override with **MERERUN_MODELS_DIR** or **--models-root**.

**MERERUN_HUB_CACHE** / **MERERUN_MODEL_CACHE_HOME**
> Control the Hugging Face snapshot cache used by **model pull** and auto-download paths.

**MERERUN_API_KEY**
> API key for non-loopback **api serve** binds; loopback can run without auth by default.

**MERERUN_FFMPEG** / **MERERUN_FFPROBE**
> Absolute paths to ffmpeg/ffprobe when not discovered on **PATH**.

Use **mere.run config** {_get_, _set_, _unset_, _list_, _path_} for runtime configuration next to the active model store.

# CAVEATS

Large models need substantial RAM/unified memory; check **model capabilities** before pulling. Licensing, download size, and hardware fit vary by model ID—see project model-sources docs before redistributing weights. Linux support is headless CLI-oriented; the SwiftUI studio and DMG installer are macOS-only. Binding **api serve** beyond loopback requires an explicit API key. Tool-loop and shell features in chat require explicit opt-in flags that weaken default safety posture.

# HISTORY

**mere.run** is an open-source Swift/MLX local inference runtime and CLI by **sawfwair**, packaging multi-modal creative workflows (image, text, speech, vision, audio, video) behind a single **mere.run** executable, with optional macOS Studio and Linux headless packages.

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/sawfwair/mere-run)```

```[Homepage](https://mere.run)```

```[Documentation](https://docs.mere.run/)```

<!-- verified: 2026-07-31 -->
