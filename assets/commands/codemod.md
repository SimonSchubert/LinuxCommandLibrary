# TAGLINE

interactive regex-based codebase refactoring tool

# TLDR

**Interactive regex replace in directory**

```codemod -m -d [directory] '[old_pattern]' '[new_pattern]'```

**Replace in specific file types**

```codemod --extensions [php,html] '[pattern]' '[replacement]'```

**Search without replacement (edit mode)**

```codemod -m -d [directory] '[pattern]'```

**Accept all changes without prompting**

```codemod --accept-all '[pattern]' '[replacement]'```

**Count matches only**

```codemod --count '[pattern]' [directory]```

# SYNOPSIS

**codemod** [_options_] _pattern_ [_replacement_] [_path_]

# DESCRIPTION

**codemod** assists with large-scale codebase refactoring that requires human oversight and judgment. Unlike fully automated find-and-replace tools, codemod presents each potential change interactively, showing a colored diff and prompting whether to accept, reject, or manually edit the modification.

This interactive approach is ideal for complex refactoring tasks like renaming functions across hundreds of files, updating API calls, or modernizing code patterns where context matters. The tool uses Python regex for pattern matching and displays sufficient surrounding code to make informed decisions.

Developed by Facebook and released as open source, codemod was designed for their massive PHP and JavaScript codebases. While the original project is now archived, it pioneered the interactive refactoring workflow later adopted by tools like fastmod and jscodeshift.

# PARAMETERS

**-m**
> Show more context around matches

**-d** _directory_
> Start searching from directory

**--extensions** _list_
> Only process files with these extensions

**--accept-all**
> Accept all changes without prompting

**--count**
> Just count matches, don't modify

**--editor** _editor_
> Editor to use for manual edits

**--exclude-paths** _pattern_
> Exclude paths matching pattern

**--include-extensionless**
> Process files without extensions

# INTERACTIVE PROMPTS

**y** - Accept change
**n** - Reject change
**e** - Edit in $EDITOR
**q** - Quit
**a** - Accept all remaining

# RELATED TOOLS

**jscodeshift**
> JavaScript/TypeScript AST-based codemod toolkit

**fastmod**
> Fast Rust-based alternative by Facebook

# CAVEATS

Uses Python regex syntax. Complex transformations may require scripting via Python API. Archived project; consider fastmod or jscodeshift for new projects.

# SEE ALSO

[sed](/man/sed)(1), [perl](/man/perl)(1), [fastmod](/man/fastmod)(1)
