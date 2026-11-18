# TAGLINE

Render a TSX video file to video, audio, stills, or a layout report

# TLDR

**Export** a composition to MP4

```cutcraft [video.tsx] --out [video.mp4]```

Write a **soundtrack** only

```cutcraft [video.tsx] --out [soundtrack.mp3]```

Grab **one frame** as a PNG

```cutcraft [video.tsx] --still [2] --out [poster.png]```

**Inspect** the timeline without starting a browser

```cutcraft inspect [video.tsx]```

Draw a **contact sheet** of the frames worth seeing

```cutcraft look [video.tsx] --out [look.png]```

**Check** that overlays stay inside the frame and the safe zone

```cutcraft [video.tsx] --check-layout --safe-zone tiktok```

Add a **media file** to the asset manifest

```cutcraft add [talk.mp4]```

**Download Chrome** before the first export

```cutcraft browser install```

# SYNOPSIS

**cutcraft** _FILE.tsx_ **--out** _OUTPUT_ [_options_]

**cutcraft** _FILE.tsx_ **--still** _SECONDS_ **--out** _IMAGE_ [_options_]

**cutcraft** _FILE.tsx_ **--check-layout** [_options_]

**cutcraft** _FILE.tsx_ **--srt** _FILE_ | **--vtt** _FILE_ [_options_]

**cutcraft** **inspect** | **look** | **where** | **fonts** | **add** | **browser** ...

# DESCRIPTION

**cutcraft** is the command-line package of CutCraft, a React library for describing video as TSX. The binary name is **cutcraft**. The npm package of the same name re-exports the renderer CLI. It needs Node.js 22.19 or newer.

An export draws frames in headless Chrome. The first export downloads Chrome for Testing into the CutCraft browser cache under the user cache directory. **browser install** does that download ahead of time. A Chrome 153 or newer binary can be named instead of the downloaded one; the environment variable is **CUTCRAFT** then **CHROMIUM**, joined with an underscore. The cache directory override is **CUTCRAFT** then **BROWSER** then **CACHE**, joined with underscores.

The asset manifest is **cutcraft.json**, found in the file's folder or the nearest folder above it, unless the TSX file exports its own **manifest** or **--manifest** names another file. Media sits in the file's folder, beside the manifest, or in **media/** beside the manifest, one file per asset id, unless **--media** names a folder. **add** writes manifest entries and picks up a transcript beside the media (**talk.json**, **talk.vtt**, or **talk.srt**).

**inspect** prints the timeline as text and does not start a browser. **look** draws many frames into one contact sheet. **where** prints each on-screen box at the moments you name. **--check-layout** prints overlays that leave the frame, leave the safe zone, or cover captions or the subject, and writes no media file. Layout issues exit **3**. Usage errors exit **2**. Other failures exit **1**.

Output extension selects the container: **.mp4** is H.264 and AAC, **.webm** is VP9 and Opus, **.mp3** or **.wav** is the soundtrack alone, **.png** or **.jpg** is a still. The license is MIT.

# COMMANDS

**inspect** _FILE.tsx_
> Print each track and element with its times, words, effects, keyframes, and cuts. **--at** adds what is on screen and heard at those moments. **--json** prints flat rows.

**look** _FILE.tsx_
> One contact sheet (default **look.png**) plus a JSON legend. With no **--at** or **--around**, the sheet is the first frame of each clip, both sides of every cut, and each overlay. **--around** samples a transition or an element. **--without** draws each frame with and without an effect or overlay. **--motion** is a strip of frames across a time range or an element id. **--listen** draws a waveform under the cells. **--frames** also writes each full frame as a PNG.

**where** _FILE.tsx_ **--at** _MOMENTS_
> Print each thing's box in pixels, whether it is inside the frame and the safe zones, and what it overlaps. A part marked in the layer source with a data-name attribute is listed too. **--json** prints the same data.

**fonts**
> List bundled families and a short Google Fonts list. **--for** filters by role (**headline**, **body**, **captions**, **numbers**, **accent**). **--category** filters by **sans**, **serif**, **slab**, **condensed**, **display**, **handwriting**, or **mono**. **--sheet** draws them as one image.

**add** _MEDIA_...
> Append each file to the manifest: kind, duration, size, frame rate, and audio, plus words from the transcript beside it. **--id** sets the asset id (default: the file name without its extension). **--transcript** names a different transcript.

**browser install**
> Download Chrome for Testing now.

# PARAMETERS

**--out** _FILE_
> Where to write. The extension picks the container. For **look**, the contact sheet path (default **look.png**). For **fonts --sheet**, the font image.

**--still** _SECONDS_
> Write the frame at this time instead of a video.

**--from** _SECONDS_, **--to** _SECONDS_
> Render only this part of the composition.

**--draft**
> A preview render: every second frame, shown twice as long, at half resolution and a low quality preset. Written beside **--out** as a **.draft** file. It does not replace the video.

**--quality** _PRESET_
> **very-low**, **low**, **medium**, **high**, or **very-high**, instead of **--bitrate**.

**--bitrate** _BPS_
> Video bits per second. Default is about 0.1 per pixel per frame.

**--codec** _NAME_
> **avc** (default for **.mp4**), **vp9** (default for **.webm**), or **av1** in either container.

**--copy**
> Copy encoded pictures from a VP9 source where a cut shows nothing else, and render only the ends.

**--tabs** _N_
> Browser pages that render pieces at once (default **1**).

**--props** _JSON_
> Props for the file's component, over its defaults.

**--manifest** _FILE_
> Asset manifest. Default: the file's **manifest** export, then the nearest **cutcraft.json**.

**--media** _DIR_
> Folder of one file per asset id.

**--import** _SPEC_
> A module the file may import beyond **react**, **zod**, and the kit: **three**, or **name=specifier**. Repeatable. The specifier is a package or a path relative to the file.

**--font** _SPEC_
> An extra font: **Name=file.ttf**, **Name:700=file.ttf**, or **Name:700:italic=file.ttf**. Repeatable.

**--srt** _FILE_, **--vtt** _FILE_
> Also write the captions the cut plays, timed like the export. Either flag alone writes only the subtitle file.

**--check-layout**
> Report layout problems and write no media. **--json** prints JSON and exits **3** when it finds issues.

**--safe-zone** _ZONE_
> **tiktok**, **reels**, **shorts**, **title-safe** (default), **action-safe**, or four fractions **top,right,bottom,left**.

**--subject** _X,Y,W,H_
> Subject box as fractions of the frame, when the manifest has no subjects.

**--silent**
> No soundtrack.

**--continue**
> Draw a grey placeholder for an asset that cannot be read, instead of failing.

**--frame-timeout** _SECONDS_
> How long one frame may take (default **60**). On expiry the command fails and names the frame.

**--keyframe** _SECONDS_
> Seconds between keyframes (default **2**).

**--quiet**
> No progress.

**--no-cache**
> For **look** and **--still**, draw every frame again. Otherwise frames are kept in **.cutcraft/cache** beside the file.

**--help**, **-h**
> Print the usage text.

# CAVEATS

The first export needs a network unless Chrome is already cached or **CUTCRAFT CHROMIUM** names a local binary (the real variable joins those two words with an underscore).

**--check-layout** exits **3** when it finds issues, so a script can tell a layout problem from a crash.

**--draft** writes a sibling file. It does not overwrite **--out**.

**look --motion** cannot be combined with **--at**, **--around**, or **--without**. **--zones** cannot be combined with **--without**.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [npx](/man/npx)(1), [ffmpeg](/man/ffmpeg)(1), [chromium](/man/chromium)(1)

# RESOURCES

```[Source code](https://github.com/prefix-tree/cutcraft)```

```[Homepage](https://cutcraft.prefixtree.xyz/)```

```[Documentation](https://cutcraft.prefixtree.xyz/guide/exporting)```

<!-- verified: 2026-11-18 -->
