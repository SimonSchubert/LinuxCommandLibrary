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

**prettier** is an opinionated code formatter. Supports many languages.

The tool formats JS, CSS, HTML, and more. Enforces consistent style.

prettier formats code.

# CAVEATS

Node.js required. Opinionated defaults.

# HISTORY

Prettier was created for **consistent code formatting** across projects.

# SEE ALSO

[eslint](/man/eslint)(1), [biome](/man/biome)(1)

