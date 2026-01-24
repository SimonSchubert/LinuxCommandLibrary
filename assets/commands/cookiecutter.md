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

**cookiecutter** creates projects from project templates. It takes a template directory or repository URL and interactively prompts for variable values, generating a new project with those values substituted.

Templates use Jinja2 syntax for variable substitution in filenames and content. This enables consistent project bootstrapping with customizable names, configurations, and boilerplate code.

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
