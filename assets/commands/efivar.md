# TAGLINE

UEFI variable management utility

# TLDR

**List** all UEFI variables

```efivar -l```

**Print** contents of a variable

```efivar -n [guid-name] -p```

**Export** a variable to a file

```efivar -n [guid-name] -e [path/to/output_file]```

**List** known GUID names

```efivar -L```

# SYNOPSIS

**efivar** [_OPTION_...]

# DESCRIPTION

**efivar** manages UEFI variables stored in NVRAM. It can list, read, write, and delete EFI variables. These variables contain boot configuration, secure boot settings, and other firmware data.

Useful for debugging UEFI boot issues and inspecting firmware configuration.

# PARAMETERS

**-l, --list**
> List current EFI variables

**-n, --name** _guid-name_
> Variable to manipulate, in the form 8be4df61-93ca-11d2-aa0d-00e098032b8c-BootOrder

**-p, --print**
> Print variable specified by --name

**-d, --print-decimal**
> Print variable in decimal format values specified by --name

**-a, --append**
> Append to variable specified by --name

**-A, --attributes** _attributes_
> Attributes to use on append

**-w, --write**
> Write to variable specified by --name

**-f, --datafile** _file_
> Load or save variable contents from file

**-e, --export** _file_
> Export variable to file

**-i, --import** _file_
> Import variable from file

**-L, --list-guids**
> Show internal GUID list

**-D, --dmpstore**
> Use DMPSTORE format when exporting

# CAVEATS

Requires root privileges for write operations. Modifying EFI variables incorrectly can prevent system boot. Some variables are protected by Secure Boot.

# SEE ALSO

[efibootmgr](/man/efibootmgr)(8), [mokutil](/man/mokutil)(1)
