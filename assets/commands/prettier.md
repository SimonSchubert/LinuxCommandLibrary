# TAGLINE

Opinionated multi-language code formatter

# TLDR

**Format a file**

```prettier --write [file.js]```

**Format multiple files**

```prettier --write "[**/*.js]"```

**Check formatting**

```prettier --check [file.js]```

**Format with specific parser**

```prettier --parser [typescript] [file]```

**List files that differ** from Prettier formatting

```prettier --list-different "[**/*.js]"```

**Format with no semicolons** and single quotes

```prettier --write --no-semi --single-quote [file.js]```

# SYNOPSIS

**prettier** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to format.

**--write**
> Edit files in place.

**--check**
> Check if formatted.

**--parser** _NAME_
> Force parser.

**--config** _FILE_
> Config file path.

**--single-quote**
> Use single quotes.

**--tab-width** _N_
> Spaces per indentation level (default: 2).

**--print-width** _N_
> Line length to wrap at (default: 80).

**--trailing-comma** _MODE_
> Trailing commas: all, es5, or none (default: all).

**--no-semi**
> Do not print semicolons.

**--use-tabs**
> Indent with tabs instead of spaces.

**--list-different**, **-l**
> Print filenames of files that differ from formatting.

**--no-config**
> Do not look for a configuration file.

**--ignore-unknown**, **-u**
> Ignore unknown files matched by patterns.

**--prose-wrap** _MODE_
> Wrapping in markdown: always, never, or preserve (default: preserve).

# DESCRIPTION

**prettier** is an opinionated code formatter that enforces a consistent style by parsing code and reprinting it with its own rules. It supports JavaScript, TypeScript, CSS, HTML, JSON, Markdown, YAML, GraphQL, and many other languages through plugins.

The tool deliberately limits configuration options to minimize style debates in teams. Files can be formatted in place with **--write** or checked for conformance with **--check**, making it suitable for both local development and CI pipelines.

# CONFIGURATION

**.prettierrc** (or **.prettierrc.json**, **.prettierrc.yaml**, **prettier.config.js**)
> Project configuration file defining formatting options like tab width, semicolons, quote style, trailing commas, and print width. Searched upward from the formatted file.

**.prettierignore**
> Glob patterns for files and directories that Prettier should skip, similar to .gitignore format.

# CAVEATS

Requires Node.js. Opinionated with deliberately limited configuration options to minimize style debates. Ignores files in node_modules by default.

# HISTORY

Prettier was created by **James Long** in **2017** for consistent code formatting across projects.

# SEE ALSO

[eslint](/man/eslint)(1), [biome](/man/biome)(1)

