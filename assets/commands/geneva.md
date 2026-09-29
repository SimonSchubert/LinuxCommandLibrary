# TAGLINE

Command-line video editor and compositor

# TLDR

**Trim** a clip (copied to a keyframe unless `--exact`)

```geneva trim [match.mp4] -o [goal.mp4] --from [41:10] --to [41:40]```

**Join** clips with a one-second crossfade

```geneva concat [day1.mp4] [day2.mp4] -o [trip.mp4] --crossfade 1s```

**Convert** for the web encode table

```geneva convert [talk.mov] -o [talk.mp4] --for web```

**Burn** subtitles into the picture

```geneva subtitles [talk.mp4] -o [talk-subbed.mp4] --burn [talk.srt]```

**Render** a JSON timeline (titles and graphics as HTML/CSS)

```geneva render [edit.json] -o [out.mp4]```

**Probe** a file's streams, duration, and colour tags

```geneva probe [talk.mp4]```

Write a **still** from a video

```geneva frame [talk.mp4] -o [thumb.jpg] --at 12s --width 640```

Print the **built-in manual** (for scripts and agents)

```geneva guide```

# SYNOPSIS

**geneva** [**--format** _human_|_json_] _subcommand_ [_options_]

**geneva** **trim** _input_ **-o** _file_ [**--from** _time_] [**--to** _time_ | **--duration** _time_] [_encode-options_]

**geneva** **concat** _input_... **-o** _file_ [**--crossfade** _time_ | **--fade** _time_] [_encode-options_]

**geneva** **convert** _input_ **-o** _file_ [_size-options_] [_encode-options_]

**geneva** **render** _timeline.json_ **-o** _file_|_dir_ [_encode-options_]

**geneva** **probe** _file_

# PARAMETERS

**--format** _human_|_json_
> Global. **json** prints one JSON document on stdout. In **human** mode diagnostics go to stderr. Default **human**

Times accept `1.5`, `1.5s`, `1500ms`, `45f` (frames at the source rate), or `00:00:01.5`.

**trim**
> Cut a range. **--from** starts the keep (default: beginning). **--to** or **--duration** ends it (default: end of the file). Copied by default, with the cut moved back to a keyframe; **--exact** for the exact frame

**concat**
> Join two or more inputs back to back. Identical stream parameters are copied; anything else is rendered. **--crossfade** _TIME_ dissolves (constant-power audio). **--fade** _TIME_ dips through **--fade-color** (black default)

**convert**
> Re-encode, optionally changing container, codec, size, or rate. **--width** / **--height** (one keeps the aspect, rounded even). **--fps**. **--fit** `contain`|`cover`|`fill`. **--crop** `X,Y,WxH` or centred `WxH` (pixels or percentages). **--speed** _FACTOR_ (`2` twice as fast; pitch follows)

**resize**
> **convert** with **--width** or **--height** required (or **--crop**)

**overlay** _input_ _overlay_ **-o** _file_
> Image or video (without its audio) over the input. **--at** `top-right` (default), `top-left`, `bottom-left`, `bottom-right`, `center`. **--margin** (default 24 px). **--scale**. **--opacity** 0–1. **--start** / **--duration**

**audio**
> One of **--extract** (audio file; **--speech** writes 16 kHz mono), **--mute**, **--replace** _FILE_, or **--mix** _FILE_ [**--gain** _DB_]

**subtitles**
> One of **--add** _FILE_ (repeatable, with **--language** codes in order), **--burn** _FILE_ (`.srt`, `.vtt`, or word-timed `.json`; **--position**, **--style** JSON, **--highlight** _COLOR_, **--fit**), or **--extract** [**--track** _N_]

**render** _timeline_ **-o** _file_|_dir_
> Render a JSON document. The container comes from the extension unless the document sets it. With an `outputs` map, **-o** is a directory

**frame** _timeline_|_video_ **-o** _picture_
> One PNG or JPEG. **--at** _TIME_ or **--frame** _N_. **--width** / **--height**. Default output `frame.png`

**validate** _timeline_
> Parse and check. **--probe** also opens media assets. **--assets** _DIR_ is the asset root (default: the timeline's directory)

**probe** _file_
> Container, duration, streams, sizes, rates, rotation, and colour tags

**schema**
> Print the JSON Schema of the current timeline format

**targets**
> Print the **--for** table (device and platform encode presets)

**guide** [_TOPIC_] [**--list**]
> Built-in manual. No topic: the agent guide. Topics: `agents`, `timeline`, `cli`, `errors`, `color`, `architecture`

**explain** _CODE_ [**--list**]
> What a diagnostic code means (any case). **--list** prints every code

Shared encode flags on the verbs (and several on **render**):

**-o** _FILE_
> Output path. The extension selects the container

**--crf** _N_
> Constant quality; lower is better. Useful range about 18–30 for H.264/H.265. Forces a re-encode

**--preset** _NAME_
> Encoder preset, `ultrafast` to `veryslow`. Forces a re-encode

**--codec** _NAME_
> `h264`, `h265`, `vp9`, `av1`, `prores`, `dnxhd`, `png`, `mjpeg`. Default: the container's usual codec

**--for** _TARGET_
> Encode for a destination: `phone`, `tablet`, `desktop`, `tv`, `web`, `youtube`, `instagram`, `tiktok`, `podcast`, `x`, `linkedin`, `email`. **--quality** `best`|`good`|`eco` (default **good**). **--budget** _SIZE_ (for example `25MB`)

**--exact**
> Frame-accurate cuts. With H.264 and system x264, a smart cut copies untouched GOPs and re-encodes only around cuts and overlays

**--renderer** _auto_|_cpu_|_gpu_
> Who composites frames. **auto** (default) uses a hardware GPU if one is present, else the CPU. Copied streams are copied either way

**--show-timeline**
> Print the compiled JSON document instead of rendering

**--no-audio**
> Write no audio track

Also: **--max-bitrate**, **--audio-codec**, **--audio-bitrate**, **--sample-rate**, **--channels**, **--keep-hdr**, **--chunks** `N`|`auto`, **--fill** `bars`|`blur`, **--profile**, **--tune**, **--keyframe-interval**, **--fixed-keyframes**.

# DESCRIPTION

**geneva** is a command-line video editor. Everyday verbs (`trim`, `concat`, `convert`, and the rest) are compiled into a JSON timeline and rendered through the same path as **geneva render**. Titles and graphics are HTML and CSS, drawn by geneva's own layout engine — no browser, Playwright, or filtergraph.

A document names the format version in `"geneva"` (current **1.1**; a `"1.0"` document is read as it is). Assets are media files or HTML. Layers hold clips; clips can be video, audio, HTML, captions, or colour. Each frame is computed from its timestamp, so a render is deterministic. HDR sources are tone-mapped to SDR unless **--keep-hdr**.

The planner picks the cheapest output mode: **copy** (packets copied), **copy-picture**, **smart** (H.264 bytes copied where the picture is untouched), **direct** (decode to encode without the compositor), or **render** (full composite). Errors are reported before rendering, with a code and a JSON path, for example `error[E200]: unknown asset "crad"`. **geneva explain E302** prints what a code means.

Codecs come from FFmpeg's libraries, bundled in the binary. H.264 uses a hardware encoder when one is allowed, else the system's **x264**, else bundled OpenH264. Smart cut and smaller H.264 files need x264 on the system (`libx264` on Debian/Ubuntu, `brew install x264` on macOS, or `GENEVA_X264` / a `libx264-*.dll` beside `geneva.exe` on Windows). H.265 is hardware-only.

Markup supports flexbox and block layout, absolute positioning, gradients, `box-shadow`, `filter: blur()`, `clip-path: polygon()`, `mix-blend-mode`, `background-clip: text`, web fonts shipped as assets, and CSS `@keyframes` played as written. Not supported: CSS grid, floats, transitions, static `transform` (transforms come from animations), and JavaScript. An unsupported declaration is reported by name and skipped.

`--format json` works on every command. Exit **0** on success, **1** if the timeline is invalid, **2** for a usage error, **3** if rendering or encoding failed.

# CAVEATS

This **geneva** is geneva-render's video editor, not Georgetown's network-evasion toolkit of the same name.

No GUI and no hosted service. One binary for Linux (x64, arm64), macOS (Apple silicon), and Windows (x64). The install script is a curl-to-shell download of a GitHub release.

OpenH264 is bundled because x264 is GPL; without x264, smart cut is off and H.264 files are larger. VideoToolbox and NVENC at constant quality, and bundled OpenH264 always, ignore **--max-bitrate**; the report says so. `--budget` puts VideoToolbox in bitrate mode.

There is no fixed average bitrate, CBR, or two-pass encode: video is constant quality under an optional ceiling.

# HISTORY

Written by Francesco Benetti. MIT licensed. First public release **1.0.0** (2026-09-25); current **1.1.0** (2026-09-28), timeline format **1.1**.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffprobe](/man/ffprobe)(1), [melt](/man/melt)(1), [handbrakecli](/man/handbrakecli)(1), [whisper](/man/whisper)(1)

# RESOURCES

```[Source code](https://github.com/geneva-render/geneva)```

```[Homepage](https://genevarender.com)```

```[Documentation](https://github.com/geneva-render/geneva/blob/main/docs/cli.md)```

<!-- verified: 2026-09-30 -->
