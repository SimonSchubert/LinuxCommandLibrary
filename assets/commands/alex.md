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
> Treat input as HTML

**--config** _file_
> Configuration file path

**--reporter** _type_
> Output format: json, compact, or default

**--quiet**
> Only report errors

**--why**
> Show detailed explanations

**-v**, **--version**
> Display version

# CAVEATS

May produce false positives; review suggestions in context. Technical terms or proper nouns may be flagged incorrectly. Configuration allows allowlisting specific terms.

# HISTORY

**alex** was created by Titus Wormer and released in **2015** as part of the unified.js ecosystem. It was designed to bring automated checking for inclusive language to the development workflow.

# SEE ALSO

[write-good](/man/write-good)(1), [proselint](/man/proselint)(1), [vale](/man/vale)(1)
