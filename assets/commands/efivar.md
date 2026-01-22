# TLDR

**List** all UEFI variables

```efivar [-l|--list]```

**Print** contents of a variable

```efivar -n [guid-name] -p```

# SYNOPSIS

**efivar** [_options_]

# DESCRIPTION

**efivar** manages UEFI variables stored in NVRAM. It can list, read, write, and delete EFI variables. These variables contain boot configuration, secure boot settings, and other firmware data.

Useful for debugging UEFI boot issues and inspecting firmware configuration.

# PARAMETERS

**-l, --list**
> List all EFI variables

**-n, --name** _guid-name_
> Specify variable by GUID and name

**-p, --print**
> Print variable value

**-w, --write**
> Write variable value

**-d, --delete**
> Delete a variable

**-a, --append**
> Append to variable

# CAVEATS

Requires root privileges for write operations. Modifying EFI variables incorrectly can prevent system boot. Some variables are protected by Secure Boot.

# SEE ALSO

[efibootmgr](/man/efibootmgr)(8), [mokutil](/man/mokutil)(1)
