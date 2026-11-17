# TAGLINE

Create, load, change, and write ISO 9660 images

# TLDR

**Create** an image from a directory

```xorriso -outdev [path/to/image.iso] -map [path/to/directory] /```

Create an image with **mkisofs-compatible** options

```xorriso -as mkisofs -o [path/to/image.iso] -V [label] -J -R [path/to/directory]```

**List** the root of an image

```xorriso -indev [path/to/image.iso] -ls /```

**Find** files by name

```xorriso -indev [path/to/image.iso] -find / -name '[*.txt]'```

**Extract** a whole image

```xorriso -osirrox on -indev [path/to/image.iso] -extract / [path/to/output_directory]```

Extract **one file**

```xorriso -osirrox on -indev [path/to/image.iso] -extract [/path/in/image] [path/to/output_file]```

**Add** a file to an existing image

```xorriso -dev [path/to/image.iso] -map [path/to/file] [/path/in/image]```

Show sessions and size (**table of contents**)

```xorriso -indev [path/to/image.iso] -toc```

# SYNOPSIS

**xorriso** [_commands_]...

**xorriso** **-as** **mkisofs** [_mkisofs-options_]...

# DESCRIPTION

**xorriso** is the GNU libburnia program for ISO 9660 filesystems. It can build an image, load one, change files inside it, and write it. Commands are options that run in order: **-outdev** names a new image, **-indev** opens one for reading, **-dev** opens one for update, **-map** copies a disk path into the image, **-ls** lists a directory, **-find** searches, and **-toc** prints sessions.

**-osirrox on** allows extraction back to the disk. **-extract** then copies an image path to a local path.

**-as mkisofs** accepts a subset of **mkisofs** options, including **-o** for the output file, **-V** for the volume label, and **-J** and **-R** for Joliet and Rock Ridge. On some distributions the **mkisofs** command itself is this compatibility mode.

The program also drives optical drives. **-indev** accepts a device such as **/dev/sr0** as well as a file.

# CAVEATS

Writing with **-dev** or **-outdev** pointed at a real drive records a disc. Point those options at a file path unless a disc is intended.

The option set is large. The examples above are the common ones. The GNU manual is the full command list. The separate programs xorrecord and osirrox are front ends of the same project and are not documented here.

# INSTALL

```apt: sudo apt install xorriso```

```dnf: sudo dnf install xorriso```

```apk: sudo apk add xorriso```

```zypper: sudo zypper install xorriso```

```brew: brew install xorriso```

```nix: nix profile install nixpkgs#xorriso```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[mkisofs](/man/mkisofs)(8), [genisoimage](/man/genisoimage)(1), [grub-mkrescue](/man/grub-mkrescue)(1), [wodim](/man/wodim)(1), [cdrecord](/man/cdrecord)(1), [isoinfo](/man/isoinfo)(8)

# RESOURCES

```[Source code](https://dev.lovelyhq.com/libburnia/libisoburn)```

```[Homepage](https://www.gnu.org/software/xorriso/)```

```[Documentation](https://www.gnu.org/software/xorriso/man_1_xorriso.html)```

<!-- verified: 2026-11-17 -->
