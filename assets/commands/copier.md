# TAGLINE

updatable project template tool

# TLDR

**Create project from template**

```copier copy [gh:user/template] [destination/]```

**Create from local template**

```copier copy [./template] [./project]```

**Update existing project**

```copier update```

**Update to specific version**

```copier update --vcs-ref [v2.0.0]```

**Recopy with new answers**

```copier recopy```

**Answer prompts non-interactively**

```copier copy --data [name=myproject] [template] [dest]```

# SYNOPSIS

**copier** _command_ [_options_] [_arguments_]

# DESCRIPTION

**copier** is a project templating tool similar to cookiecutter but with a crucial distinction: it can update existing projects when the template evolves. This makes it ideal for maintaining multiple projects based on a shared template, as you can propagate improvements and bug fixes from the template to all derived projects.

The tool uses Jinja2 templating and supports both Git repository URLs and local paths as template sources. Templates are versioned using Git tags, allowing projects to track which template version they were created from and update to newer versions while preserving local customizations.

copier stores metadata about template answers in the generated project, enabling the **update** command to intelligently merge template changes with your modifications. This addresses a major limitation of traditional project generators where improvements to the template couldn't be applied to existing projects. The tool requires Python 3.10+ and is particularly popular in Python and web development communities.

# COMMANDS

**copy** _template_ _destination_
> Create new project from template

**update**
> Update project from template

**recopy**
> Regenerate with new answers

# PARAMETERS

**--data** _key=value_
> Answer questions non-interactively

**--vcs-ref** _ref_
> Git reference (tag/branch)

**--trust**
> Trust template (run tasks)

**--pretend**
> Preview without creating files

**--skip** _path_
> Skip specific paths

**--force**
> Overwrite without prompting

**-a**, **--answers-file** _file_
> Load answers from file

# TEMPLATE STRUCTURE

Files ending in .jinja are rendered. Others are copied as-is.

```
template/
├── copier.yml        # Config & questions
├── {{project_name}}/ # Dynamic directory
└── README.md.jinja   # Templated file
```

# CAVEATS

Requires Python 3.10+ and Git 2.27+. Templates versioned by Git tags. Use --trust for templates with tasks.

# SEE ALSO

[cookiecutter](/man/cookiecutter)(1), [yeoman](/man/yeoman)(1)
