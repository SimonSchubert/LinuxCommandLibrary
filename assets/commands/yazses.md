# TAGLINE

Offline hold-to-talk voice dictation daemon

# TLDR

Print the **next setup steps** for this machine (read-only)

```yazses quickstart```

**Start** the dictation daemon, then hold the hotkey and speak

```yazses start```

Check **microphone, injection, and permissions**

```yazses doctor```

Change the **hold-to-talk key**

```yazses hotkey set [right_ctrl]```

**Transcribe** an existing recording offline

```yazses transcribe [path/to/audio.m4a]```

Write **SRT subtitles** instead of a sidecar **.txt**

```yazses transcribe [path/to/audio.mp3] --format srt```

Tag **who said what** (needs the diarization extra)

```yazses transcribe [path/to/meeting.m4a] --diarize```

Capture a **whole meeting** without holding a key

```yazses meeting start```

Show **daemon state, model, and hotkey**

```yazses status```

**Stop** the daemon

```yazses stop```

# SYNOPSIS

**yazses** [_options_] [_command_] [_args_]

# PARAMETERS

**-h**, **--help**
> Show grouped command help. Every subcommand also accepts **-h** / **--help**.

**-V**, **--version**
> Print the installed version.

**--install-completion**
> Install shell tab completion for commands and options.

**--show-completion**
> Print the completion script instead of installing it.

**quickstart**
> Print the next three steps for this machine. Changes nothing.

**doctor**
> Verify platform, microphone, keyboard capture, injection backend, model cache, and config. Each line is OK / WARN / FAIL / SKIP.

**setup**
> On Linux, install audio and injection packages, join the **input** group, and enable **ydotoold** on Wayland. **--dry-run** previews the changes.

**start** / **restart** / **stop**
> Control the dictation daemon. **start** restarts an already-running instance instead of spawning a duplicate.

**status**
> Show state, hotkey, model, injection backend, uptime, and recent decode latency. **--json** for scripts.

**hotkey show** / **hotkey set** _key_
> Show or change the hold-to-talk key (**right_alt**, **right_ctrl**, **space**, …). Default **auto** is **right_alt** on Linux. Restart the daemon after changing it.

**transcribe** _file_
> Transcribe a local audio or video file offline. **--format** / **-f** is **txt** (default), **md**, **srt**, **vtt**, or **json**. **--out** / **-o** sets the output path. **--model**, **--language**, and **--diarize** override the dictation config for this run.

**meeting start** / **meeting stop**
> Hands-free meeting capture. Off by default; enable with **yazses features enable meeting**.

**features**
> List capabilities and turn them on or off without editing the config file.

**autostart enable** / **disable** / **status**
> Install or remove a systemd user unit that starts YazSes at login.

**enroll**
> Record short utterances and write microphone / VAD thresholds to the config.

**logs**
> Print the diagnostic log (metadata only, not dictated text). **-n** sets the line count.

# DESCRIPTION

**yazses** is an offline voice dictation and speech-to-text tool for Linux (X11 and Wayland), macOS, and Windows. You hold a hotkey, speak, and release; on-device **faster-whisper** transcribes the clip and the text is typed into the focused window. There is no account, API key, or network call in the default path.

It also transcribes existing recordings (**yazses transcribe**) and can capture a whole meeting with speaker labels (**yazses meeting**). Dictation works out of the box. Speaker diarization and local-LLM meeting minutes are extras, off by default.

On Linux, **yazses setup** installs PortAudio, injection tools (**xdotool** on X11, **ydotool** / **wtype** on Wayland), and adds the user to the **input** group so the hotkey can be read from the kernel. Joining that group only takes effect after a full log-out and log-in.

The daemon loads the speech model once (first start can take 10–30 seconds) and then listens for the hotkey. **yazses start** prefers a systemd user unit when one is installed; otherwise it detaches. **yazses-daemon** runs the same process in the foreground for debugging.

# CONFIGURATION

Settings live in **~/.config/yazses/config.toml** on Linux. Every section has defaults, so a missing file is valid. Prefer **yazses features enable** / **disable** over hand-edits; that path writes the right keys and keeps comments.

```
[stt]
engine = "faster-whisper"
model = "base.en"
language = "en"
device = "cpu"
compute_type = "int8"

[hotkey]
key = "auto"
hold_threshold_ms = 500

[audio]
device = ""
max_record_seconds = 300

[injection]
backend = "auto"
```

**model** defaults to **base.en** for hold-to-talk latency. Use **small.en** for fewer word errors at about twice the decode time. English-only **.en** checkpoints cannot decode other languages; set **model = "small"** (no suffix) together with **language**.

**injection.backend** **auto** picks **xdotool** on X11 and **ydotool** on Wayland. **clipboard** pastes with Ctrl+V (instant, but a no-op in many terminals). **wtype** is Wayland-only.

# CAVEATS

First use downloads a speech model (on the order of a hundred megabytes for **base.en**). Linux hotkeys stay dead until you log out after **yazses setup** joins the **input** group; a new terminal tab is not enough. Meeting capture and **--diarize** need extra packages and models. Default checkpoints are English-first. The tray icon needs a system tray host (on GNOME, the AppIndicator extension). Experimental features refuse to enable unless you pass **--force**.

# HISTORY

**YazSes** is an Apache-2.0 project by **Mohsen Seyedkazemi Ardebili**. It is built on **faster-whisper** (CTranslate2) for on-device transcription and aims at hold-to-talk dictation without a cloud account.

# SEE ALSO

[whisper](/man/whisper)(1), [faster-whisper](/man/faster-whisper)(1), [ffmpeg](/man/ffmpeg)(1), [ydotool](/man/ydotool)(1), [xdotool](/man/xdotool)(1), [wtype](/man/wtype)(1)

# RESOURCES

```[Source code](https://github.com/MSKazemi/yazses)```

```[Documentation](https://mskazemi.com/yazses/)```

<!-- verified: 2026-09-13 -->
