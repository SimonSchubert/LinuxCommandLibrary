# TAGLINE

Local renderer for narrated explainer videos

# TLDR

**Check** Node, ffmpeg, Chrome, and the speech models

```explainroo doctor```

**Download** the voice and timing models (about 400 MB)

```explainroo doctor --fetch```

**Start** a project in the chalk look, sized for YouTube

```explainroo init [how-dns-works] --theme [chalk] --size [youtube] --title ["How DNS finds a website"]```

**Preview** in a browser; the page reloads when the script is saved

```explainroo preview [how-dns-works]```

Generate **narration and word timings**

```explainroo voice [how-dns-works]```

Save a **PNG** of one moment in a scene

```explainroo still [how-dns-works] [intro@2.4]```

**Find** layout, timing, and pronunciation problems

```explainroo check [how-dns-works]```

Render a **half-size draft**

```explainroo render [how-dns-works] --draft```

Render the **full** MP4, using four Chrome workers

```explainroo render [how-dns-works] --workers [4]```

**Check** the finished file for loudness, black frames, and a clear voice

```explainroo verify [how-dns-works]```

Hear one **voice**

```explainroo say ["DNS finds a website"] --voice [am_michael] --out [sample.wav]```

**Search** the built-in icons

```explainroo icons [lock] [key]```

# SYNOPSIS

**explainroo** _command_ [_project_] [_arguments_] [_options_]

**explainroo** **--help** | **-h**

**explainroo** **version** | **--version**

# DESCRIPTION

**explainroo** turns a project directory into a narrated MP4 on the local machine. `script.md` is the words the voice says. `scenes.js` draws the pictures in JavaScript, and a drawing can appear on a particular word. `video.json` sets the look, size, voice, and pace. Kokoro reads the script, a timestamped Whisper model marks when each word is spoken, Chrome draws the frames, and **ffmpeg** muxes picture, voice, music, and sound effects into `out/video.mp4`.

Drawings can use hand-drawn lines, more than 1,800 Lucide icons, charts, code, terminal windows, your own screenshots, and optional AI illustrations. The tool also builds product-demo scenes: reconstructed app screens with a pointer that clicks and types. It does not shoot or import filmed footage.

Most commands take the project directory as the first argument and use the current directory when it is omitted. `still` and `image` treat the first argument as a project only when that path contains `video.json`. **--json** prints machine-readable output on stdout; logs go to stderr. **--quiet** suppresses logs.

The repository is written so a coding agent can author `script.md` and `scenes.js` by following `AGENTS.md`. The same commands work by hand. Inside a clone, `npm link` puts `explainroo` on `PATH`. Without a link, run `node bin/explainroo.js` from the repository.

# COMMANDS

**init** _dir_ [**--theme** _name_] [**--size** _size_] [**--pace** _N_] [**--voice** _id_] [**--title** _text_]
> Create a project: `video.json`, a starter `script.md` and `scenes.js`, an `assets/` directory, and a `.gitignore`. Refuses if `video.json` already exists. Defaults: theme `paper`, size `16:9`, voice `af_heart`, title from the directory name.

**voice** [_project_] [**--force**]
> Generate narration and word timings. Prints each scene's duration and how much of the speech check matched. Only changed scenes are redone unless **--force** is set.

**preview** [_project_] [**--port** _N_]
> Serve a live preview (default port **4400**) and reload narration when `video.json` or `script.md` changes. Stop with Ctrl+C.

**still** [_project_] [_time_ ...] [**--scale** _N_]
> Write PNG stills. A time is `12.5`, a scene id, `scene@2.4`, `scene@start`, or `scene@end`. With no times, saves the end of every scene. **--scale** defaults to 1.

**sheet** [_project_] [**--scene** _id_] [**--every** _seconds_] [**--cols** _N_]
> Write a contact sheet of the whole video, or of one scene.

**check** [_project_] [**--step** _seconds_]
> Look for layout, timing, and pronunciation problems. **--step** is the sample interval (default **0.25**). Exits **1** when any finding is an error.

**render** [_project_] [**--draft**] [**--from** _s_] [**--to** _s_] [**--workers** _N_] [**--scale** _N_] [**--out** _file_]
> Write `out/video.mp4`. **--draft** writes a half-size `out/draft.mp4`. **--from** and **--to** are seconds. **--workers** is how many Chrome pages draw at once. **--out** sets the file.

**verify** [_project_] [**--file** _path_]
> Check the rendered file for duration, size, loudness, true peak, black frames, silence, and whether the narration is understandable. **--file** checks another file. Exits **1** on an error-level finding.

**image** [_project_] _name_ _prompt_ [**--model** _best_|_cheap_] [**--aspect** _ratio_] [**--ref** _a,b_] [**--style** _text_] [**--no-style**]
> Make one AI illustration through OpenRouter and save `assets/<name>.png`. Needs **OPENROUTER_API_KEY**.

**images** [_project_]
> List generated images and what they cost.

**voices**
> List the 28 English voices (American and British).

**say** _text_ [**--voice** _id_] [**--speed** _N_] [**--out** _file_]
> Speak a short line to a WAV file. Default voice `af_heart`, speed **1**, output `<voice>.wav`.

**themes**
> List the looks (`paper`, `clean`, `chalk`, `blueprint`, `midnight`) and the music styles.

**formats**
> List platform sizes (YouTube, Shorts, TikTok, Reels, Instagram, LinkedIn, and square) and the safe content area of each.

**icons** [_word_ ...]
> Search the built-in icons by name and tag. With no words, prints how many icons are shipped.

**doctor** [**--fetch**]
> Check Node.js (20.11 or newer), ffmpeg, and Chrome or Chromium. Reports whether the Kokoro and Whisper models are cached. **--fetch** downloads them (about 400 MB the first time). Exits **1** when Node, ffmpeg, or Chrome is missing; missing models alone do not fail the command.

**help**, **version**
> Print usage or the version from `package.json`. **--help** / **-h** and **--version** do the same. An unknown command exits **2**.

# PARAMETERS

**--json**
> Machine-readable output on stdout. Logs stay on stderr.

**--quiet**
> Suppress log lines.

**--help**, **-h**
> Print the command summary.

**--version**
> Print the version and exit.

# CONFIGURATION

A project is configured in `video.json`. Unknown or out-of-range values stop the command with an error. Useful keys:

**title**
> Title shown in the preview. Defaults from the script.

**theme**
> Look: `paper` (default), `clean`, `chalk`, `blueprint`, or `midnight`.

**size**
> `16:9` (default), a ratio (`9:16`, `1:1`, `4:5`), a platform name (`youtube`, `shorts`, `tiktok`, `reels`, `vertical`, `instagram`, `linkedin`, `square`), or `WIDTHxHEIGHT`.

**voice**
> Voice id (default `af_heart`). `explainroo voices` lists them.

**speed**
> How fast the voice speaks, from 0.6 to 1.6 (default **0.9**).

**pace**
> Scales voice, pauses, and animation together, from 0.7 to 1.6 (default **1**).

**fps**
> 24, 25, 30 (default), 50, or 60.

**music**
> `true` (default) uses the look's music style. A style name (`warm`, `upbeat`, `calm`, `tech`, `playful`), an object `{ "style": "calm", "volume": 0.35 }`, or `false`.

**sfx**
> Sound effects: `true` (default), `"minimal"`, or `false`.

**captions**
> `true`, `false`, or `"auto"` (default). `"auto"` captions tall and square videos and leaves wide videos without captions.

**transition**
> `"auto"` (default), `fade`, `slide`, `wipe`, `zoom`, `brush`, or `cut`.

**watermark**
> Corner text, default `explainroo.com`. `false` turns it off.

**loudness**
> Target loudness of the finished video in LUFS (default **-14**).

One scene can override timing in its `script.md` heading, for example `## outro {hold=2 transition=cut}` with `hold`, `lead`, `min`, or `transition`.

# ENVIRONMENT

**OPENROUTER_API_KEY**
> Key for the **image** command. Also read from a `.env` file in the explainroo checkout or the project.

**EXPLAINROO_CHROME**
> Path to Chrome or Chromium when auto-detection fails.

**EXPLAINROO_FFMPEG**, **EXPLAINROO_FFPROBE**
> Paths to ffmpeg and ffprobe.

**EXPLAINROO_CACHE**
> Where speech models are stored. Default `~/.cache/explainroo`.

**EXPLAINROO_OFFLINE**
> Set to `1` to refuse model downloads.

**EXPLAINROO_TTS_DTYPE**
> Voice-model precision. `fp32` is the default. `q8` is a smaller download and runs slower.

**EXPLAINROO_DEBUG**
> Set to `1` to print a full stack trace on errors.

# CAVEATS

Install from the Git repository (Node.js 20.11 or newer, ffmpeg, and Chrome or Chromium). The public npm registry has no `explainroo` package:

```git clone https://github.com/vincentsch/explainroo.git && cd explainroo && npm install && npm link```

The first **voice**, **say**, or **doctor --fetch** downloads about 400 MB of models into `~/.cache/explainroo`. Voice and the pronunciation check are English only. Drawing, speech, and the speech check run on the CPU. **preview** listens on localhost. **image** spends OpenRouter credit (about 7 to 13 cents a picture); **images** prints the project total. Generated music and sound effects are synthesized by explainroo. Screenshots and AI pictures you add keep their own licenses.

# HISTORY

**explainroo** is an MIT-licensed Node.js tool by **Vincent Schmalbach**. The GitHub repository was created on **25 September 2026**. Speech is Kokoro (Apache-2.0), word timing is Whisper through Transformers.js, drawings use Rough.js and Lucide, Playwright drives Chrome, and ffmpeg writes the MP4. Fonts are under the SIL Open Font License.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffprobe](/man/ffprobe)(1), [whisper](/man/whisper)(1), [node](/man/node)(1), [npm](/man/npm)(1), [chromium](/man/chromium)(1), [playwright](/man/playwright)(1)

# RESOURCES

```[Source code](https://github.com/vincentsch/explainroo)```

```[Homepage](https://www.explainroo.com)```

```[Documentation](https://www.explainroo.com/docs/)```

<!-- verified: 2026-10-03 -->
