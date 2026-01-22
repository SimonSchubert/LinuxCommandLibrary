# TLDR

List available **licenses**

```proctl -ll```

List available **languages**

```proctl -lL```

**Pick** license interactively

```proctl -pl```

**Pick** language interactively

```proctl -pL```

**Remove** licenses from project

```proctl -r```

Create new license **template**

```proctl -t```

**Delete** license template

```proctl -R [@license_name]```

# SYNOPSIS

**proctl** [**-ll**|**-lL**|**-pl**|**-pL**|**-r**|**-t**|**-R** _license_]

# PARAMETERS

**-ll, -list-licenses**
> List all available license templates

**-lL, -list-languages**
> List supported programming languages

**-pl, -pick-license**
> Interactive license selection via fzf

**-pL, -pick-language**
> Interactive language selection via fzf

**-r, -remove-license**
> Remove licenses from current project

**-t, -new-template**
> Create a new license template

**-R, -delete-license**
> Delete license templates

**-h, -help**
> Display help information

# DESCRIPTION

**proctl** manages project licenses and language configurations. It provides templated license management with interactive selection, making it easy to add or switch licenses in projects.

The tool supports custom license templates and integrates with fzf for fuzzy selection of licenses and languages.

# CAVEATS

Requires fzf for interactive menus. License templates stored in user configuration. Custom templates need manual creation.

# HISTORY

**proctl** was created by **CreativeCodeCat** to streamline project license management, particularly useful for developers who work on multiple projects with different licensing requirements.

# SEE ALSO

[license](/man/license)(1), [fzf](/man/fzf)(1)
