# TAGLINE

Generate beautiful images of source code

# TLDR

**Create code image from file**

```carbon-now [file.js]```

**Create image from clipboard**

```carbon-now --from-clipboard```

**Create image from stdin**

```echo "const x = 1;" | carbon-now```

**Use interactive mode to customize everything**

```carbon-now [file.js] --interactive```

**Use a saved preset configuration**

```carbon-now [file.js] -p [dracula]```

**Specify output location**

```carbon-now [file.js] --save-to [~/Pictures]```

**Open in browser instead of saving**

```carbon-now [file.js] --open-in-browser```

**Create image and copy to clipboard**

```carbon-now [file.js] --to-clipboard```

# SYNOPSIS

**carbon-now** [_options_] [_file_]

# PARAMETERS

**-i**, **--interactive**
> Launch interactive mode to customize theme, font, padding, and other settings before generating the image.

**-p**, **--preset** _name_
> Apply a saved preset from `~/.carbon-now.json`. Defaults to `latest-preset`, which automatically reuses the previous run's settings.

**--save-to** _path_
> Directory to save the image. Defaults to current working directory.

**--save-as** _name_
> Image filename without extension. Defaults to the source filename with a hash suffix.

**--from-clipboard**
> Read code from clipboard instead of a file or stdin.

**--to-clipboard**
> Copy the resulting image to clipboard instead of saving to disk.

**--open-in-browser**
> Open the Carbon URL in a browser for manual finishing instead of downloading the image.

**-s**, **--start** _line_
> Starting line number of input to use. Default: `1`.

**-e**, **--end** _line_
> Ending line number of input to use. Default: `1000`.

**--settings** _json_
> Override specific settings for this run as a JSON string (highest priority, overrides preset and interactive).

**--config** _file_
> Use a custom local config file instead of `~/.carbon-now.json` (read-only, changes are not persisted).

**--engine** _name_
> Rendering engine to use: `chromium` (default), `firefox`, or `webkit`.

**--skip-display**
> Do not display the image inline in the terminal after generation.

**--disable-headless**
> Run the Playwright browser in headful (visible) mode instead of headless.

# DESCRIPTION

**carbon-now-cli** generates beautiful images of source code using the Carbon service (carbon.now.sh). It automates the download of high-quality PNG or SVG code images with syntax highlighting, customizable themes, fonts, and backgrounds — all from the terminal.

Input can be a file, piped stdin, or clipboard content. The file type is detected automatically for syntax highlighting. Use `--interactive` mode to be prompted for all visual settings, or save those settings as a named preset in `~/.carbon-now.json` for reuse with `--preset`.

Each run's settings are automatically saved as `latest-preset`, so subsequent runs reuse the previous configuration without any extra flags. Named presets persist until manually deleted from `~/.carbon-now.json`.

The `--settings` flag accepts a JSON string and has the highest override priority, after `--interactive`. Export size (`1x`, `2x`, `4x`), export type (`png`, `svg`), line numbers, drop shadow, padding, and custom per-token theme colors are all configurable through presets.

# CAVEATS

Requires internet connectivity to reach the Carbon rendering service. Custom theme colors set via the `custom` preset key are not applied when using `--open-in-browser` because they rely on `localStorage` inside the Playwright instance. Image generation depends on external service availability.

# HISTORY

Carbon was created by **Dawn Labs** and launched in **2017** as a web application for creating beautiful code images. The carbon-now-cli was developed as a community project to provide command-line access to the service. It became popular among developers for quickly generating code images for documentation, tweets, and presentations without opening a browser.

# SEE ALSO

[silicon](/man/silicon)(1), [pygmentize](/man/pygmentize)(1), [highlight](/man/highlight)(1)
