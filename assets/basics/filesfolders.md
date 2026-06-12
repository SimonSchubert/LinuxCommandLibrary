# Files & Folders

## Navigating
**pwd** shows where you are, **cd** moves you somewhere else.
```[pwd](/man/pwd)```
```[cd](/man/cd) [path]```
```[cd](/man/cd) ..```
```[cd](/man/cd) ~```
```[cd](/man/cd) -```

> **cd ..** goes to the parent directory, **cd ~** (or plain **cd**) to your home directory, and **cd -** back to wherever you were before.

## Listing Contents
**ls** lists a directory. **-l** shows details, **-a** includes hidden files (names starting with a dot), **-h** prints human-readable sizes.
```[ls](/man/ls)```
```[ls](/man/ls) -lah```
```[ls](/man/ls) -lt```
```[tree](/man/tree)```

Modern replacements add colors, icons, and git status.
```[eza](/man/eza) -la```
```[lsd](/man/lsd) -la```

> **ls -lt** sorts by modification time, newest first. Add **-r** to reverse any sort order.

## Viewing Files
**cat** prints a whole file, **less** lets you scroll and search through it (press **q** to quit, **/** to search). **bat** is a cat clone with syntax highlighting.
```[cat](/man/cat) [fileName]```
```[less](/man/less) [fileName]```
```[bat](/man/bat) [fileName]```

Show only the beginning or end of a file. **tail -f** keeps following a file as it grows, ideal for logs.
```[head](/man/head) -n 20 [fileName]```
```[tail](/man/tail) -n 20 [fileName]```
```[tail](/man/tail) -f [logFile]```

Inspect what a file is and how big it is.
```[file](/man/file) [fileName]```
```[wc](/man/wc) [fileName]```

> **wc** prints lines, words, and bytes. Use **wc -l** for just the line count.

## Creating
**touch** creates an empty file (or updates the timestamp of an existing one). **mkdir -p** creates nested directories in one step and does not complain if they already exist.
```[touch](/man/touch) [fileName]```
```[mkdir](/man/mkdir) [folderName]```
```[mkdir](/man/mkdir) -p path/to/nested/folder```
```> [fileName]```

## Copying, Moving, Renaming
**cp** copies, **mv** moves and renames (there is no separate rename command). Use **-r** to copy directories recursively.
```[cp](/man/cp) [fileName] [newFileName]```
```[cp](/man/cp) -r [folder] [folderCopy]```
```[mv](/man/mv) [oldName] [newName]```
```[mv](/man/mv) [fileName] [targetFolder]/```

> Both **cp** and **mv** overwrite existing targets without asking. Add **-i** to be prompted, or **-n** to never overwrite.

## Deleting
**rm** removes files, **-r** removes directories with everything in them. There is no undo.
```[rm](/man/rm) [fileName]```
```[rm](/man/rm) -r [folderName]```
```[rmdir](/man/rmdir) [emptyFolderName]```

> **rm** deletes permanently and immediately. For anything you are not sure about, use the trash instead, or at least run **rm -ri** to confirm each deletion.

Move files to the desktop trash instead of deleting them outright.
```[gio](/man/gio) trash [file]```
```[trash-put](/man/trash-put) [file]```
```[trash-list](/man/trash-list)```
```[trash-empty](/man/trash-empty)```
```[gio](/man/gio) trash --empty```

## Links
A **symbolic link** is a pointer to a path; it breaks if the target moves. A **hard link** is a second name for the same file content and keeps working until all names are deleted.
```[ln](/man/ln) -s [target] [linkName]```
```[ln](/man/ln) [target] [linkName]```
```[readlink](/man/readlink) -f [linkName]```

> Symbolic links (**ln -s**) are what you want in almost all cases. Hard links cannot span filesystems or point at directories.

## Permissions & Ownership
Every file has an owner, a group, and permission bits for owner/group/others. **ls -l** shows them, **stat** shows everything.
```[ls](/man/ls) -l [file]```
```[stat](/man/stat) [file]```

**chmod** changes permissions, either symbolically or with octal digits (read=4, write=2, execute=1).
```[chmod](/man/chmod) +x [script]```
```[chmod](/man/chmod) 644 [file]```
```[chmod](/man/chmod) 755 [folder]```
```[chmod](/man/chmod) -R u+rwX [folder]```

| Mode | Description |
|-----|-------------|
| **644** | Owner reads and writes, everyone else reads (typical file) |
| **755** | Owner full access, everyone else reads and enters (typical directory or script) |
| **600** | Only the owner reads and writes (private keys, secrets) |
| **700** | Only the owner has any access (private directory) |

**chown** changes the owner and group, **chgrp** just the group. Changing the owner requires root.
```[chown](/man/chown) [user]:[group] [file]```
```[chown](/man/chown) -R [user]:[group] [folder]```
```[chgrp](/man/chgrp) [group] [file]```

## Searching File Contents
**grep** searches inside files, **rg** (ripgrep) does the same recursively by default and much faster.
```[grep](/man/grep) "phrase" [fileName]```
```[grep](/man/grep) -rn "phrase" [folder]```
```[rg](/man/rg) "phrase"```

> To find files by name, size, or age, see the **Search & Find** basics page.

## Comparing Files
**diff -u** shows differences in the familiar patch format.
```[diff](/man/diff) -u [file1] [file2]```
```[diff](/man/diff) -r [folder1] [folder2]```

## Disk Usage
**du** measures what directories contain, **df** shows free space per filesystem.
```[du](/man/du) -h --max-depth=1```
```[df](/man/df) -h```

Interactive and prettier alternatives make it easy to find what eats your disk.
```[ncdu](/man/ncdu)```
```[dust](/man/dust)```
```[duf](/man/duf)```

## Mounting Filesystems
List block devices, identify the filesystem on a partition, then mount it to a directory.
```[lsblk](/man/lsblk) -f```
```[mount](/man/mount) /dev/[device] [path]```
```[umount](/man/umount) [path]```

## Editing Text Files
Any of these editors works in the terminal. **nano** is the easiest to start with; vim and emacs have their own basics pages.
```[nano](/man/nano) [fileName]```
```[vi](/man/vi) [fileName]```
```[emacs](/man/emacs) [fileName]```
```[micro](/man/micro) [fileName]```
