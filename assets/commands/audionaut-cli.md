# TAGLINE

Headless CLI for Audionaut multitrack `.audium` projects

# TLDR

**Create** a stereo project package

```audionaut-cli create [song.audium] --channels [2]```

**Import** audio files at a timeline offset

```audionaut-cli import [song.audium] [take1.wav] [take2.wav] --position [4.5]```

Print a **JSON summary** of tracks, clips, and tempo

```audionaut-cli info [song.audium] --json```

**Split** every clip at bar 23

```audionaut-cli split [song.audium] --at [23]```

Name a **region** from a bar range

```audionaut-cli create-region [song.audium] --name [chorus] --start [17] --end [25]```

Place that region **later** on the timeline

```audionaut-cli place-clip [song.audium] --region [chorus] --at [33]```

**Export** a 48 kHz 24-bit WAV mix

```audionaut-cli export [song.audium] -o [mix.wav] --sample-rate [48000] --bit-depth [24]```

Export **lossy** MP3

```audionaut-cli export [song.audium] -o [mix.mp3] --bitrate [320]```

# SYNOPSIS

**audionaut-cli** [**--json**] [**--quiet**] _verb_ _project.audium_ [_options_]

**audionaut-cli** **--help** | **-h**

**audionaut-cli** **--version**

# DESCRIPTION

**audionaut-cli** is the console binary for **Audionaut**, a JUCE-based multitrack audio editor. It reads and writes `.audium` project packages without a GUI or audio device, so scripts, CI, and AI agents can create projects, import audio, edit the timeline, analyse, auto-edit, assemble arrangements, separate stems, and bounce mixes.

Each invocation is one **verb**. The project argument may be the `.audium` package directory or the `Project.json` inside it. Positions and durations are musical by default (4/4, 24 clocks per beat, 96 clocks per bar). **--unit** selects `bars`, `beats`, `seconds`, or `clocks`; bars and beats are 1-based on the timeline, seconds and clocks start at 0. Option values accept `--opt value` or `--opt=value`.

**--json** prints exactly one result envelope on stdout — `{"ok": true, "result": ...}` or `{"ok": false, "error": {"code": ..., "message": ...}}` — with logs on stderr. Exit codes: **0** success, **1** operation failed, **2** usage error, **3** feature unavailable in this build (for example `analyze` without Essentia).

The desktop **Audionaut** binary accepts the same verbs headlessly and then quits. On Linux that binary is `audionaut` from the `.deb` or the AppImage. If the GUI already has the project open, a verb is handed to the live document as one undo step and `Project.json` is not written. Set **AUDIONAUT_AGENT_ROUTING=0** to edit the file on disk instead. The MCP package `audionaut-mcp` (`npx -y audionaut-mcp`) exposes the same verbs to agents; it runs the installed app rather than this standalone CLI unless configured otherwise.

# COMMANDS

**info** _project_ [**--raw**]
> Print a summary (tempo, tracks, clips). **--raw** dumps the full persistence JSON.

**create** _project_ [**--channels** _N_]
> Create a new empty `.audium` package (default: one stereo track).

**import** _project_ _audio..._ [**--position** _seconds_]
> Import audio files at the given position in seconds (default 0) and save.

**export** _project_ **-o** _file_ [**--sample-rate** _N_] [**--bit-depth** _N_ | **--bitrate** _kbps_] [**--channels** _N_] [**--multi-mono**] [**--start** _S_] [**--length** _S_] [**--region** _name_ [**--track** _N_]]
> Offline bounce. The output extension selects the format: `.wav` (8/16/24/32-bit), `.flac` (16/24-bit, up to 8 channels), `.aiff` (8/16/24-bit), `.ogg` (Vorbis, **--bitrate** 64–500, default 192), `.mp3` (LAME, **--bitrate** 96/128/160/192/256/320, mono or stereo, up to 48 kHz). **--multi-mono** writes one mono file per channel. **--region** bounces a single region dry, without clip gains or fades.

**analyze** _project_|_audio-file_ [**--types** _a,b_]
> Run Essentia analysis and cache results next to the project for auto-edit, assemble, and the GUI. Default types include `sbic` and `beat_degara`. Exit **3** if Essentia is not in the build.

**auto-edit** _project_ [**--track** _N_] [**--clip** _N_] [**--measures** _M_] [**--segments** _N_] [**--duration** _S_] [**--no-crossfades**]
> Segment a clip using cached analysis. Run **analyze** first.

**assemble** _project_ [**--track** _N_] [**--duration** _S_] [**--mode** _random_|_sequential_] [**--seed** _N_] [**--no-crossfades**]
> Build an arrangement of the given duration from the project's regions.

**split** _project_ **--at** _P_ [**--unit** _unit_]
> Split the clip under that position on every track.

**create-region** _project_ **--name** _name_ **--start** _A_ **--end** _B_ [**--unit** _unit_]
> Name a region from a timeline range on every track whose clip fully contains it.

**set-region** _project_ **--region** _name_ [**--rename** _new_] [**--track** _N_] [**--start** _A_] [**--end** _B_ | **--length** _L_] [**--unit** _unit_]
> Rename and/or retrim a region (clamped to the source audio). Retrimming affects every clip that uses the region.

**remove-clip** _project_ (**--at** _P_ | **--region** _name_) [**--track** _N_] [**--unit** _unit_] [**--delete-region**]
> Remove a clip at a position, or every placement of a named region. **--delete-region** also drops the region unless other clips still use it.

**move-clip** _project_ (**--at** _P_ | **--region** _name_) [**--to** _Q_] [**--to-track** _N_|_new_] [**--track** _N_] [**--unit** _unit_]
> Move exactly one matching clip. At least one of **--to** and **--to-track** is required.

**place-clip** _project_ **--region** _name_ **--at** _P_ [**--track** _N_] [**--unit** _unit_]
> Place an existing region on the timeline.

**cleanup-regions** _project_
> Delete regions no clip uses, plus empty resource groups. Audio files stay in the package.

**clip-gain** _project_ (**--at** _P_ | **--region** _name_) **--gain** _G_ [**--db**] [**--channel** _C_] [**--track** _N_] [**--unit** _unit_]
> Set clip gain (linear, or dB with **--db**) on every destination channel, or one channel with **--channel**.

**clip-fades** _project_ (**--at** _P_ | **--region** _name_) [**--fade-in** _X_] [**--fade-out** _X_] [**--fade-in-start** _X_] [**--fade-out-end** _X_] [**--fade-in-curve** _C_] [**--fade-out-curve** _C_] [**--track** _N_] [**--unit** _unit_]
> Set fade ramps (0 clears) and curve exponents (0.1–4, 0.5 = equal power). Offsets are measured inward from the clip edges; a negative offset extends the ramp outside the clip.

**clip-speed** _project_ (**--at** _P_ | **--region** _name_) [**--track** _N_] [**--ratio** _R_ | **--semitones** _N_ | **--length** _L_ [**--unit** _unit_]] [**--mode** _repitch_|_stretch_] [**--lock-tempo** _on_|_off_] [**--tempo** _BPM_]
> Change playback speed. Ratio 2.0 is double speed (half duration); range 0.25–4.0. **--mode stretch** preserves pitch. **--lock-tempo on** ties the clip to project tempo.

**remove-track** _project_ **--track** _N_
> Remove a track (channels, clips, and regions). Track ids below it shift up. Audio files stay in the package.

**remove-channel** _project_ **--track** _N_ **--channel** _C_
> Remove channel _C_ (0-based) from track _N_.

**separate** _project_ [**--track** _N_] [**--clip** _N_] [**--threads** _N_] [**--model** _path_] [**--no-mute-source**] [**--backend** _demucs_|_fake_]
> Split a clip into Drums/Bass/Other/Vocals tracks with Demucs (`htdemucs`). Needs model weights (downloaded by the app, or **--model**). **--backend fake** copies the clip into the Vocals stem for tests.

# PARAMETERS

**--json**
> One machine-readable envelope on stdout; logs on stderr.

**--quiet**
> Suppress log output.

**--help**, **-h**
> List verbs and usage.

**--version**
> Print the CLI version string.

# ENVIRONMENT

**AUDIONAUT_DISABLE_ANALYTICS**
> When set to any non-empty value, skip CLI usage reporting even if the desktop app has granted analytics consent. Recommended for CI.

**AUDIONAUT_AGENT_ROUTING**
> Set to `0` to edit the project file on disk even when the GUI has that project open. Default routing hands the verb to the live document, or fails rather than overwriting unsaved work if the host cannot be reached.

# CAVEATS

The standalone CLI is built from the test CMake project (`cmake --build … --target AudionautCli`); packaged Linux installs may ship only the GUI binary, which still runs the same verbs. `analyze` needs an Essentia-enabled build. `separate` needs Demucs weights and can take minutes on a full song. On macOS the sandboxed app CLI can only reach entitlement-covered locations such as `~/Music`; this standalone binary has no such limit. Leave `Autosave.json` and `Host.json` inside a project package alone. CLI analytics fire only after the app's opt-in consent (verb and exit code only).

# HISTORY

**Audionaut** is written in C++ on the JUCE framework by **Klaus Voltmer** (Voltmer Systems). The code base went open source under GPLv3 (with a commercial licence option) on **15 August 2026**. The headless CLI and MCP server (`audionaut-mcp`) expose the same edit verbs the timeline uses so agents can drive sessions.

# SEE ALSO

[sox](/man/sox)(1), [ffmpeg](/man/ffmpeg)(1), [lame](/man/lame)(1), [flac](/man/flac)(1), [audacity](/man/audacity)(1), [ardour](/man/ardour)(1)

# RESOURCES

```[Source code](https://github.com/kvoltmer/Audionaut)```

```[Homepage](https://audionaut.app)```

```[Documentation](https://github.com/kvoltmer/Audionaut/blob/main/docs/manual/11-cli-and-agents.md)```

<!-- verified: 2026-10-02 -->
