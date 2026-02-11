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

**Show diff**

```prettier --write --list-different [file.js]```

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
> Tab width.

# DESCRIPTION

**prettier** is an opinionated code formatter that enforces a consistent style by parsing code and reprinting it with its own rules. It supports JavaScript, TypeScript, CSS, HTML, JSON, Markdown, YAML, GraphQL, and many other languages through plugins.

The tool deliberately limits configuration options to minimize style debates in teams. Files can be formatted in place with **--write** or checked for conformance with **--check**, making it suitable for both local development and CI pipelines.

# CONFIGURATION

**.prettierrc** (or **.prettierrc.json**, **.prettierrc.yaml**, **prettier.config.js**)
> Project configuration file defining formatting options like tab width, semicolons, quote style, trailing commas, and print width. Searched upward from the formatted file.

**.prettierignore**
> Glob patterns for files and directories that Prettier should skip, similar to .gitignore format.

# CAVEATS

Node.js required. Opinionated defaults.

# HISTORY

Prettier was created for **consistent code formatting** across projects.

# SEE ALSO

[eslint](/man/eslint)(1), [biome](/man/biome)(1)

