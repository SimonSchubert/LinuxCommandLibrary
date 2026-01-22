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

**copier** renders project templates with Jinja2 templating. Supports Git URLs and local paths. Unique feature: update existing projects when template evolves while preserving your changes.

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
