# TAGLINE

Display file and filesystem metadata

# TLDR

**Display file status**

```stat [file]```

**Display in terse format**

```stat -t [file]```

**Display filesystem status**

```stat -f [file]```

**Custom format output**

```stat -c "%n: %s bytes" [file]```

**Show access time**

```stat -c "%x" [file]```

**Show modification time**

```stat -c "%y" [file]```

**Show permissions in octal**

```stat -c "%a" [file]```

**Show all info for multiple files**

```stat [file1] [file2] [file3]```

**Follow symbolic links**

```stat -L [symlink]```

# SYNOPSIS

**stat** [_options_] _file_...

# DESCRIPTION

**stat** displays detailed information about files or filesystems. It shows metadata including size, permissions, ownership, timestamps, inode number, and device information.

The default output includes file name, size, blocks, device, inode, links, access permissions, ownership, and access/modify/change times. Custom format strings allow selecting specific fields.

stat is useful for scripting when specific file attributes are needed, or for investigating file properties not shown by ls.

# PARAMETERS

**-f**, **--file-system**
> Display filesystem status instead of file.

**-L**, **--dereference**
> Follow symbolic links.

**-t**, **--terse**
> Print terse output.

**-c** _format_, **--format=** _format_
> Use custom format string.

# FORMAT SEQUENCES (FILE)

**%a**: Access rights in octal
**%A**: Access rights in human readable form
**%F**: File type
**%g**: Group ID
**%G**: Group name
**%h**: Number of hard links
**%i**: Inode number
**%n**: File name
**%s**: Size in bytes
**%u**: User ID
**%U**: User name
**%x**: Access time
**%y**: Modification time
**%z**: Change time

# FORMAT SEQUENCES (FILESYSTEM)

**%a**: Free blocks
**%b**: Total blocks
**%f**: Free blocks (non-root)
**%n**: File name
**%s**: Block size
**%T**: Filesystem type

# CAVEATS

Output format differs between GNU stat (Linux) and BSD stat (macOS). Some filesystems don't support all attributes. Access times may be disabled on some systems for performance.

# HISTORY

**stat** has different origins on different systems. The GNU version (part of **coreutils**) was written by **Michael Meskes** in **2001**. BSD systems have their own implementation with slightly different syntax. The command provides a standard interface to the stat() system call.

# SEE ALSO

[ls](/man/ls)(1), [file](/man/file)(1), [touch](/man/touch)(1), [chmod](/man/chmod)(1)
