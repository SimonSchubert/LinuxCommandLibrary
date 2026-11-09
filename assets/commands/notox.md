# TAGLINE

Sanitize filenames by removing toxic characters

# TLDR

**Preview filename changes** (safe mode, default)

```notox [path/to/directory]```

**Apply the renames**

```notox -d [path/to/directory]```

**Apply the renames silently**

```notox -d -q [path/to/directory]```

**Output changes as JSON**

```notox --json [path/to/directory]```

Output **pretty-printed JSON**

```notox -p [path/to/directory]```

Output **only errors** as JSON

```notox -e [path/to/directory]```

# SYNOPSIS

**notox** [_options_] [_path_...]

# PARAMETERS

**-d**, **--do**
> Execute the renames (default is preview only).

**-q**, **--quiet**
> Print nothing.

**-j**, **--json**
> Output results in JSON format.

**-p**, **--json-pretty**
> Output results as pretty-printed JSON.

**-e**, **--json-error**
> Output only the errors as JSON.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show the version.

# DESCRIPTION

**notox** is a CLI tool that renames files in a directory to eliminate problematic characters from filenames such as spaces, special characters, and non-ASCII characters. By default it operates in safe mode, displaying proposed changes without applying them. Without a path, it works on the current directory.

# CAVEATS

Always previews changes before applying. Use **-d** flag to actually rename files. JSON output requires the **serde** build feature, which is enabled by default.

# HISTORY

**notox** was created by **Its-Just-Nans** and is written in **Rust**.

# SEE ALSO

[detox](/man/detox)(1), [rename](/man/rename)(1)

# RESOURCES

```[Source code](https://github.com/Its-Just-Nans/notox)```

```[Homepage](https://n4n5.dev/notox/)```

<!-- verified: 2026-11-09 -->
