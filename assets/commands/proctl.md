# TAGLINE

Manage project licenses and language configs

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

**proctl** [**-i**|**-ll**|**-lL**|**-c**|**-pl**|**-pL**|**-P** _license_|**-r**|**-sl** _query_|**-sL** _query_|**-T**|**-t**|**-R** _license_|**-C**|**-k**]

# PARAMETERS

**-i, -initialize**
> Set up a git repository for a project

**-ll, -list-licenses**
> List all available license templates

**-lL, -list-languages**
> List supported programming languages

**-c, -current-license**
> Display the active project license

**-pl, -pick-license**
> Interactive license selection via fzf

**-pL, -pick-languages**
> Interactive language selection via fzf

**-P, -preview-license**
> View a specific license template

**-r, -remove-license**
> Remove licenses from current project

**-sl, -search-license**
> Find licenses matching a query pattern

**-sL, -search-language**
> Find languages matching a query pattern

**-T, -template-help**
> Show template variable documentation

**-t, -new-template**
> Create a new license or language template

**-R, -delete-license**
> Remove one or more license templates from the system

**-C, -new-config**
> Generate default configuration file

**-k, -check-conflict**
> Detect conflicting license files

**-h, -help**
> Display help information

# DESCRIPTION

**proctl** manages project licenses and language configurations. It provides templated license management with interactive selection, making it easy to add or switch licenses in projects.

The tool supports custom license templates and integrates with fzf for fuzzy selection of licenses and languages. Configuration is stored in **~/.config/license.conf** (auto-generated on first launch or with **-new-config**).

# CAVEATS

Optionally requires fzf for interactive pick menus (**-pl**, **-pL**). License templates stored in user configuration. Custom templates need manual creation.

# HISTORY

**proctl** was created by **HeCodes2Much** (CreativeCodeCat) to streamline project license management, particularly useful for developers who work on multiple projects with different licensing requirements.

# SEE ALSO

[licensor](/man/licensor)(1), [fzf](/man/fzf)(1)
