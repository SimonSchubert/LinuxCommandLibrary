# TAGLINE

project template generator

# TLDR

**Create project from template**

```cookiecutter [https://github.com/user/template]```

**Create from local template**

```cookiecutter [/path/to/template]```

**Create without prompts** (use defaults)

```cookiecutter --no-input [template]```

**Override template variables**

```cookiecutter [template] [project_name]="[MyProject]"```

**List installed templates**

```cookiecutter --list-installed```

**Replay last creation**

```cookiecutter --replay [template]```

**Output to specific directory**

```cookiecutter -o [/output/path] [template]```

# SYNOPSIS

**cookiecutter** [_options_] _template_

# DESCRIPTION

**cookiecutter** is a command-line utility for creating projects from templates, eliminating the need to manually set up boilerplate code and project structure. It takes a template directory (local or from a Git repository) and prompts for configuration values, then generates a complete project with those values substituted throughout.

Templates use Jinja2 syntax for variable substitution in both filenames and file content. For example, a template might prompt for "project_name" and use it to create directories, populate setup files, and customize code comments. This ensures consistency across projects while allowing customization.

The tool has spawned a large ecosystem of community templates for frameworks like Django, Flask, React, and many others. cookiecutter is language-agnostic and can template any type of project. It supports advanced features like conditional file inclusion, pre/post-generation hooks, and replay files for reproducing previous configurations. The tool has become a standard in Python development and influenced similar tools in other ecosystems.

# PARAMETERS

**-o**, **--output-dir** _path_
> Output directory for generated project.

**--no-input**
> Use default values without prompting.

**-c**, **--checkout** _branch_
> Git branch or tag to checkout.

**-v**, **--verbose**
> Print debug information.

**--replay**
> Use previously entered values.

**--replay-file** _file_
> Use values from specified file.

**-f**, **--overwrite-if-exists**
> Overwrite existing output directory.

**-s**, **--skip-if-file-exists**
> Skip files that already exist.

**--list-installed**
> List installed templates.

**--config-file** _file_
> User configuration file.

# CAVEATS

Templates must follow cookiecutter conventions. Git required for remote templates. Complex templates may have many prompts. Jinja2 errors in templates cause failures.

# HISTORY

**cookiecutter** was created by **Audrey Roy Greenfeld** in **2013**. It popularized the concept of project templating in the Python community and inspired similar tools in other languages. The tool has enabled thousands of community templates for various frameworks and project types.

# SEE ALSO

[copier](/man/copier)(1), [yeoman](/man/yeoman)(1), [cargo-generate](/man/cargo-generate)(1)
