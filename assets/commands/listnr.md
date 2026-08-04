# TAGLINE

Local dual-lane meeting transcription for macOS

# TLDR

**Install** via Homebrew and grant permissions

```brew tap rokib16x/listnr https://github.com/rokib16x/listnr```

```brew trust --tap rokib16x/listnr```

```brew install listnr```

```listnr setup```

Start the **interactive** shell, then live-transcribe

```listnr```

```/live```

One-shot session for **N seconds** with two remote speakers expected

```listnr start --seconds 60 --speakers 2```

Transcribe **Bangla** (or other supported languages)

```listnr start --language bn --seconds 120```

Speak any language; transcript in **English**

```listnr start --language bn --translate --seconds 120```

**List / download** Whisper models

```listnr models list```

```listnr models download whisper-large-v2```

Check **permissions** and environment

```listnr doctor```

# SYNOPSIS

**listnr** [_command_] [_options_]

# PARAMETERS

**(no command)**
> Start the interactive REPL (**listnr>** prompt). Common in-session commands: **/live** [_seconds_], **/stop** or **q**, **/lang** _code_, **/translate**, **/speakers** _n_, **/model** _id_, **/diarize**, **/sensitivity** high|low, **/dump**, **/status**, **/help**.

**start** [**--seconds** _n_] [**--speakers** _n_] [**--language** _code_] [**--translate**] ...
> One-shot capture without the interactive shell. Transcript goes to **stdout**; progress and meters to **stderr**. Omitting **--seconds** runs until Ctrl+C.

**setup**
> Guide you through granting **Microphone** and **Screen & System Audio Recording** permissions to the host terminal app.

**doctor**
> Report which permissions and dependencies are missing.

**models list**
> List available WhisperKit model ids and sizes.

**models download** _id_
> Prefetch model weights from Hugging Face into the local cache.

# DESCRIPTION

**listnr** is a macOS command-line meeting listener. It captures **two separate audio lanes**: your **microphone** (always labeled **You**) and **system / speaker audio** (remote participants). Both lanes are transcribed **on-device** with **WhisperKit** (Core ML). Remote speakers are split into **Speaker 1…N** with **SpeakerKit** diarization after the session ends. Audio and transcripts never leave the machine except for the one-time model download from Hugging Face.

Using a **headset** is strongly recommended so remote audio does not bleed into the microphone lane. Sessions write Markdown transcripts under **~/Documents/Listnr/**. Optional **/dump** writes raw WAV debug audio with owner-only permissions.

Supported languages include English, Bangla, Hindi, Spanish, French, German, Japanese, and Chinese. **/translate** uses Whisper's translate-to-English task (one-way). Default models balance live latency; larger models improve accuracy at the cost of real-time headroom.

# CAVEATS

**macOS 14+ on Apple Silicon only** (Intel Macs are not supported). Permissions attach to the **terminal app**, not the binary—switching Terminal ↔ iTerm requires re-granting. Beta software (**0.x**): CLI flags and behavior may change. Diarization of remote speakers runs **after** you stop (live labels are all **Others**). Memory grows with session length (~460 MB per hour of dual-lane audio in RAM). Recording other people may require **all-party consent** under local law—obtain agreement before use. Session options like language and model do not currently persist across restarts.

# HISTORY

**Listnr** is an MIT-licensed open-source project by Rokibul Hasan. It builds on **WhisperKit** / **SpeakerKit** for on-device speech and diarization, and is distributed as a prebuilt Homebrew formula, notarized **.pkg**, and source build via Swift Package Manager.

# SEE ALSO

[whisper](/man/whisper)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/rokib16x/listnr)```

```[Homepage](https://github.com/rokib16x/listnr)```

<!-- verified: 2026-08-04 -->
