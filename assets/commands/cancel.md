# TLDR

**Cancel the current print job on the default printer**

```cancel```

**Cancel a specific print job by ID**

```cancel [job_id]```

**Cancel a print job on a specific printer**

```cancel [printer_name]-[job_id]```

**Cancel all print jobs on a specific printer**

```cancel -a [printer_name]```

**Cancel all print jobs on all printers**

```cancel -a```

**Cancel all jobs owned by a specific user**

```cancel -u [username]```

# SYNOPSIS

**cancel** [**-E**] [**-U** _username_] [**-a**] [**-h** _hostname_[**:**_port_]] [**-u** _username_] [**-x**] [_id_] [_destination_] [_destination-id_]

# DESCRIPTION

**cancel** is a CUPS command that cancels print jobs. Without arguments, it cancels the currently printing job on the default destination. Jobs can be specified by job ID, destination printer, or both.

Job IDs are assigned by the print system and can be viewed with **lpstat**. The destination-id format combines the printer name and job ID (e.g., "myprinter-42").

# PARAMETERS

**-a**
> Cancel all jobs on the specified destination, or all destinations if none specified

**-E**
> Force encryption when connecting to the server

**-h** _hostname_[**:**_port_]
> Specify alternate server

**-u** _username_
> Cancel jobs owned by the specified user

**-U** _username_
> Specify the username for authentication

**-x**
> Delete job data files in addition to canceling

# CAVEATS

The **-a** and **-u** options require administrative privileges. These restrictions are controlled by operation policies in **cupsd.conf** for "Cancel-Jobs" and "Cancel-My-Jobs" operations.

CUPS printer names can contain any printable character except SPACE, TAB, "/", or "#", and are case-insensitive.

# SEE ALSO

[lpr](/man/lpr)(1), [lprm](/man/lprm)(1), [lpstat](/man/lpstat)(1), [lp](/man/lp)(1)
