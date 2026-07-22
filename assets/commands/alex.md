# TAGLINE

Catch insensitive, inconsiderate writing in text.

# TLDR

**Check** a file for insensitive language

```alex [file.md]```

Check **multiple files**

```alex [file1.md] [file2.md]```

Check from **stdin**

```echo "This is crazy" | alex --stdin```

Check with **custom config**

```alex --config [.alexrc] [file.md]```

Output as **JSON**

```alex --reporter json [file.md]```

# SYNOPSIS

**alex** [_options_] [_files_...]

# DESCRIPTION

**alex** catches insensitive, inconsiderate writing in text. It helps you find gender-favoring, polarizing, race-related, religion-inconsiderate, or other unequal phrasing in text.

The tool is designed for documentation, README files, and other written content, helping teams maintain inclusive language in their projects.

# PARAMETERS

**--stdin**
> Read from standard input

**--text**
> Treat input as plain text (not markdown)

**--html**
> Search for and treat input as HTML (.html, .htm) files

**--mdx**
> Search for and treat input as MDX (.mdx) files

**--config** _file_
> Configuration file path

**--reporter** _type_
> Output format: json, compact, or default

**--quiet**
> Only report errors, suppressing files without problems

**--why**
> Show source of every message (which rule triggered it)

**--diff**
> Ignore unchanged lines (useful in CI to only report on the diff)

**-v**, **--version**
> Display version

**-h**, **--help**
> Display help text

# CONFIGURATION

**.alexrc**
> JSON or YAML configuration file in the project root. Defines allowed terms, custom rules, and language preferences.

**.alexignore**
> Lists files and directories to exclude from checking, using gitignore-style patterns.

# CAVEATS

May produce false positives; review suggestions in context. Technical terms or proper nouns may be flagged incorrectly. Configuration allows allowlisting specific terms.

# HISTORY

**alex** was created by Titus Wormer and released in **2015** as part of the unified.js ecosystem. It was designed to bring automated checking for inclusive language to the development workflow.

# INSTALL

```brew: brew install alexjs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[write-good](/man/write-good)(1), [proselint](/man/proselint)(1), [vale](/man/vale)(1)

# RESOURCES

```[Source code](https://github.com/get-alex/alex)```

```[Homepage](https://alexjs.com/)```

<!-- verified: 2026-06-11 -->
