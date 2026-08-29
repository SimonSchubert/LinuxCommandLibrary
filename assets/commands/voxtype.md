# TAGLINE

push-to-talk voice-to-text daemon for Linux desktops

# TLDR

**Run** the dictation daemon

```voxtype```

**Download** a model and check dependencies

```voxtype setup --download```

**Pick** a transcription model interactively

```voxtype setup model```

**Start/stop** recording from a compositor keybinding

```voxtype record start```

```voxtype record stop```

**Transcribe** an audio file

```voxtype transcribe [recording.wav]```

**Print** daemon status as JSON (for Waybar)

```voxtype status --format json --follow```

# SYNOPSIS

**voxtype** [_options_] [_command_]

# DESCRIPTION

**voxtype** is an offline-first voice-to-text tool for Wayland and X11. Hold a hotkey (default ScrollLock), speak, release, and the transcript is typed at the cursor (or copied to the clipboard). Omarchy ships it as the optional dictation stack (*Install > AI > Dictation*).

Transcription runs locally. Engines include Whisper (whisper.cpp), Parakeet, Moonshine, SenseVoice, Paraformer, Dolphin, and Omnilingual. Output goes through **wtype** on Wayland, with **dotool** / **ydotool** / clipboard fallbacks. Compositor bindings should call **voxtype record start** / **stop** (or **toggle**) rather than relying on the built-in evdev hotkey.

# COMMANDS

**daemon**
> Run in the foreground (default when no command is given).

**setup** [**--download** | **systemd** | **waybar** | **model** | **gpu** | **onnx**]
> Dependency checks, model download, systemd user unit, Waybar snippet, GPU/ONNX switching.

**record start** | **stop** | **toggle**
> Control recording from compositor keybindings or scripts.

**transcribe** _file_
> Transcribe an audio file.

**status**
> Daemon state for bars. **--format json**, **--follow**, **--extended**.

**config**
> Show the current configuration.

**meeting start** | **stop** | **status** | **export** | **list** | **summarize**
> Continuous meeting transcription and export (Markdown, JSON, SRT, VTT).

# PARAMETERS

**-c**, **--config** _FILE_
> Config path (default **~/.config/voxtype/config.toml**).

**--model** _MODEL_
> Override the transcription model.

**--engine** _ENGINE_
> Override the engine (whisper, parakeet, moonshine, sensevoice, paraformer, dolphin, omnilingual).

**--hotkey** _KEY_
> Override the built-in hotkey.

**--toggle**
> Press once to start recording, again to stop.

**--clipboard** / **--paste**
> Force clipboard, or clipboard plus simulated Ctrl+V.

**-v**, **-q**
> Increase verbosity, or quiet (errors only).

# CONFIGURATION

**~/.config/voxtype/config.toml**
> Hotkey, audio device, engine/model, output mode (**type**, **clipboard**, **paste**), replacements, and post-process command. **voxtype configure** (where shipped) edits this interactively.

# CAVEATS

Needs PipeWire or PulseAudio, a typing backend (**wtype** recommended on Wayland), and a downloaded model. Built-in evdev hotkeys require membership in the **input** group; compositor bindings do not. wtype does not work on GNOME/KDE Wayland (dotool/ydotool fallback). GPU and ONNX engines use separate binaries/packages.

# INSTALL

```aur: yay -S voxtype```

```nix: nix profile install nixpkgs#voxtype```

<!-- packages: 2026-08-29 -->

# SEE ALSO

[wtype](/man/wtype)(1), [ydotool](/man/ydotool)(1), [wl-copy](/man/wl-copy)(1)

# RESOURCES

```[Source code](https://github.com/peteonrails/voxtype)```

```[Homepage](https://voxtype.io)```

```[Documentation](https://github.com/peteonrails/voxtype/blob/main/docs/USER_MANUAL.md)```

<!-- verified: 2026-08-29 -->
