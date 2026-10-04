# TAGLINE

Format JavaScript, TypeScript, and related files with Deno

# TLDR

**Format** every supported file in the current directory

```deno fmt```

**Format** specific files or directories

```deno fmt [main.ts] [src/]```

**Check** formatting in CI without writing changes

```deno fmt --check```

Stop at the **first** unformatted file

```deno fmt --check --fail-fast```

Reformat whenever a file **changes**

```deno fmt --watch```

Format code from **stdin**

```cat [main.ts] | deno fmt -```

**Skip** generated directories

```deno fmt --ignore=[dist/,build/]```

Use **single quotes** and a wider line

```deno fmt --single-quote --line-width=[100] [src/]```

Indent with **tabs**

```deno fmt --use-tabs [src/]```

# SYNOPSIS

**deno fmt** [_options_] [_files_...]

# DESCRIPTION

**deno fmt** is the code formatter built into the Deno runtime. It rewrites JavaScript, TypeScript, JSX, TSX, JSON, Markdown, YAML, HTML, CSS, and several other formats to one consistent style. There is no separate `deno-fmt` binary: the subcommand ships inside **deno**.

With no paths, it formats supported files under the current directory. Pass files or directories to limit the run. A lone **-** reads source from standard input and writes the formatted result to standard output, which editor integrations use.

The implementation is based on **dprint**. Markup and stylesheet formatters only adjust whitespace: they do not reorder tokens, and they leave unknown or broken syntax unchanged instead of failing. Fenced code blocks in Markdown are formatted when the fence names a supported language.

**--check** reports files that differ and exits non-zero, which is the usual CI gate. **--check --fail-fast** stops at the first mismatch. **--watch** reformats again when watched files change.

Svelte, Vue, Astro, and Angular files need **--unstable-component** (or `"unstable": ["fmt-component"]` in the config file). SQL needs **--unstable-sql** (or `"unstable": ["fmt-sql"]`).

# PARAMETERS

**--check**
> Exit non-zero if any file is not already formatted. Do not write changes.

**--fail-fast**
> With **--check**, stop at the first unformatted file.

**--watch**
> Reformat when files change.

**--watch-exclude** _paths_
> Paths or patterns to leave out of watch mode.

**--ignore**=_paths_
> Skip these files or directories (comma-separated).

**-c**, **--config** _file_
> Configuration file. `deno.json` or `deno.jsonc` is detected automatically when this flag is omitted.

**--no-config**
> Do not load a configuration file.

**--ext** _extension_
> Treat input as this type (for example `ts` or `md`). Needed when reading stdin or a file whose name has no recognized extension.

**--indent-width** _n_
> Spaces per indent level. Default is 2.

**--line-width** _n_
> Maximum line width. Default is 80.

**--use-tabs**
> Indent with tabs instead of spaces.

**--single-quote**
> Prefer single quotes. The default is double quotes.

**--no-semicolons**
> Omit semicolons except where the syntax requires them.

**--prose-wrap** _mode_
> How to wrap Markdown prose: `always`, `never`, or `preserve`. Default is `always`.

**--no-editorconfig**
> Do not read `.editorconfig`.

**--permit-no-files**
> Exit successfully when no files match. Otherwise that case is an error.

**--unstable-component**
> Also format Svelte, Vue, Astro, and Angular files.

**--unstable-sql**
> Also format SQL files.

**--no-clear-screen**
> Do not clear the terminal on each watch-mode restart.

# CONFIGURATION

**deno.json** / **deno.jsonc**
> The `fmt` object sets `useTabs`, `lineWidth`, `indentWidth`, `semiColons`, `singleQuote`, and `proseWrap`. `include` and `exclude` arrays limit which files are formatted.

**.editorconfig**
> Fills any option not set by a CLI flag or the `fmt` object. `indent_style`, `indent_size`, and `max_line_length` map onto the formatter options. Precedence is CLI flags, then `deno.json`, then `.editorconfig`, then built-in defaults.

**// deno-fmt-ignore**
> On the line above a statement, leave the next JavaScript, TypeScript, or JSONC item unformatted.

**// deno-fmt-ignore-file**
> At the top of a JavaScript or TypeScript file, skip the whole file.

**<!-- deno-fmt-ignore -->**
> In Markdown, HTML, or CSS, skip the next item. `<!-- deno-fmt-ignore-start -->` and `<!-- deno-fmt-ignore-end -->` skip a range. `<!-- deno-fmt-ignore-file -->` skips the file.

**# deno-fmt-ignore**
> In YAML, skip the next item.

# CAVEATS

The command is `deno fmt`, not `deno-fmt`. Component frameworks and SQL are off unless the matching unstable flag or config entry is set. **--check** fails the process when formatting would change a file. An empty match set fails unless **--permit-no-files** is set. Formatting does not type-check or lint; use `deno check` and `deno lint` for those.

# HISTORY

A formatter has shipped inside the **deno** binary since Deno 1.0 in **2020**. The current engine is **dprint**, so the same style rules apply across JavaScript, TypeScript, JSON, Markdown, and the other supported formats without a separate npm package.

# INSTALL

```pacman: sudo pacman -S deno```

```apk: sudo apk add deno```

```zypper: sudo zypper install deno```

```brew: brew install deno```

```nix: nix profile install nixpkgs#deno```

<!-- packages: 2026-10-04 -->

# SEE ALSO

[deno](/man/deno)(1), [prettier](/man/prettier)(1), [biome](/man/biome)(1), [rustfmt](/man/rustfmt)(1)

# RESOURCES

```[Source code](https://github.com/denoland/deno)```

```[Homepage](https://deno.com)```

```[Documentation](https://docs.deno.com/runtime/reference/cli/fmt)```

<!-- verified: 2026-10-04 -->
