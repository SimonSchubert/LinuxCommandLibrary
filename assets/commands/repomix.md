# TAGLINE

Pack repository into AI-friendly format

# TLDR

**Pack repository**

```repomix```

**Pack specific directory**

```repomix [path/to/repo]```

**Custom output file**

```repomix -o [output.txt]```

**Include specific files**

```repomix --include "[*.ts,*.js]"```

**Exclude patterns**

```repomix --ignore "[node_modules,dist]"```

**XML output format**

```repomix --style xml```

# SYNOPSIS

**repomix** [_-o file_] [_--include pattern_] [_--ignore pattern_] [_path_]

# PARAMETERS

**-o**, **--output** _FILE_
> Output filename.

**--include** _PATTERN_
> Include patterns.

**--ignore** _PATTERN_
> Ignore patterns.

**--style** _FORMAT_
> Output style (plain, xml, markdown).

**--top-files-len** _N_
> Summary file count.

**-c**, **--config** _FILE_
> Config file path.

# DESCRIPTION

**repomix** packs an entire code repository into a single text file optimized for use as context in AI language model conversations. It concatenates source files with clear file boundary markers and a directory tree summary, making it easy for LLMs to understand the full structure and content of a codebase.

The tool automatically respects .gitignore rules to skip irrelevant files like dependencies and build artifacts. Include and exclude patterns provide fine-grained control over which files are packed. Built-in token counting estimates how much of an LLM's context window the output will consume, helping users stay within model limits.

Output formats include plain text, XML, and Markdown, each with clear file delimiters and optional metadata headers. The tool can be configured via a **repomix.config.json** file for consistent usage across a project.

# CONFIGURATION

**repomix.config.json**
> Project-level configuration file specifying default output format, include/exclude patterns, and output filename. Loaded automatically from the repository root.

# CAVEATS

Large repos may exceed limits. Binary files skipped. Needs Node.js.

# HISTORY

**repomix** was created to package codebases into a single file optimized for AI language model context windows.

# SEE ALSO

[git](/man/git)(1), [tree](/man/tree)(1), [cat](/man/cat)(1)
