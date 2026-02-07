# TAGLINE

source code to LLM prompt converter

# TLDR

**Generate a prompt** from source code

```code2prompt [path/to/project]```

**Generate with specific template**

```code2prompt [path] --template [template_name]```

**Output to clipboard**

```code2prompt [path] --clipboard```

**Filter by file extensions**

```code2prompt [path] --filter [*.py,*.js]```

**Exclude patterns**

```code2prompt [path] --exclude [node_modules,*.log]```

# SYNOPSIS

**code2prompt** [_options_] _path_

# PARAMETERS

**--template** _name_
> Use a specific prompt template.

**--clipboard**
> Copy output to clipboard.

**--filter** _patterns_
> Include only files matching patterns.

**--exclude** _patterns_
> Exclude files matching patterns.

**--tokens**
> Count and display token usage.

# DESCRIPTION

**code2prompt** transforms source code into structured prompts optimized for Large Language Models (LLMs). It recursively traverses a codebase, formats files with proper context including file paths and structure, and generates comprehensive prompts suitable for AI code assistants like Claude, GPT-4, or other LLMs.

The tool intelligently filters files based on patterns and extensions, excluding common noise like node_modules, build artifacts, and log files. Template support allows customizing the output format for different use cases such as code review, documentation generation, or architectural analysis.

Token counting helps ensure prompts fit within model context limits. The clipboard integration streamlines workflows by directly copying output for immediate use in AI chat interfaces. This is particularly valuable for providing complete codebase context when asking AI assistants for refactoring suggestions, bug analysis, or understanding unfamiliar projects.

# SEE ALSO

[tree](/man/tree)(1), [find](/man/find)(1)
