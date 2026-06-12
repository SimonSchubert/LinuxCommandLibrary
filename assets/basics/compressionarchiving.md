# Compression & Archiving

## Getting Started
On Linux, archiving and compression are two separate steps: **tar** bundles many files into one archive, while compressors like **gzip**, **xz**, and **zstd** shrink a single data stream. That is why the typical format is a compressed tar archive such as **.tar.gz** or **.tar.zst**. The **zip** and **7z** formats do both jobs in one tool.

## Tar Archives
The first option tells **tar** what to do: **c** creates, **x** extracts, **t** lists. Add **f** for the archive file name and **v** to print each file as it is processed.

| Option | Description |
|-----|-------------|
| **c** | Create an archive |
| **x** | Extract an archive |
| **t** | List archive contents |
| **f** | Archive file name (must come right before it) |
| **v** | Verbose: show files being processed |
| **z** | gzip compression (.tar.gz) |
| **j** | bzip2 compression (.tar.bz2) |
| **J** | xz compression (.tar.xz) |
| **--zstd** | zstd compression (.tar.zst) |
| **-C dir** | Change to directory before extracting |
| **--exclude=pattern** | Skip files matching a pattern |

```[tar](/man/tar) czf archive.tar.gz [files]```
```[tar](/man/tar) cJf archive.tar.xz [files]```
```[tar](/man/tar) --zstd -cf archive.tar.zst [files]```
```[tar](/man/tar) czf backup.tar.gz --exclude="*.log" [directory]```

When extracting, modern GNU tar detects the compression automatically, so plain **xf** works for every format.
```[tar](/man/tar) xf archive.tar.gz```
```[tar](/man/tar) xf archive.tar.zst -C [directory]```

List the contents before extracting an archive from an untrusted source, and extract single files by naming them.
```[tar](/man/tar) tf archive.tar.gz```
```[tar](/man/tar) xf archive.tar.gz path/inside/archive.txt```

> A well-behaved archive contains a single top-level directory. If **tar tf** shows loose files instead, extract into a fresh directory with **-C** to avoid littering your current one.

## Choosing a Compressor
All compressors trade speed against ratio. As a rule of thumb: **zstd** is the modern default, **gzip** is the universal lowest common denominator, **xz** squeezes hardest when time does not matter.

| Tool | Description |
|-----|-------------|
| **gzip** | Fast, supported everywhere, moderate ratio |
| **bzip2** | Better ratio than gzip but slow, mostly legacy |
| **xz** | Highest ratio, slow to compress, common for releases |
| **zstd** | Very fast with ratios near xz, best general choice |
| **lz4** | Extremely fast, lower ratio, good for live pipes |

## Compressing Single Files
The classic compressors share one interface: they compress a file in place, replace it, and append their extension. **-k** keeps the original, **-d** decompresses, and **-1** to **-9** trade speed for ratio.
```[gzip](/man/gzip) [file]```
```[gzip](/man/gzip) -k -9 [file]```
```[bzip2](/man/bzip2) [file]```
```[xz](/man/xz) [file]```
```[zstd](/man/zstd) [file]```
```[zstd](/man/zstd) -19 [file]```

Each has a matching decompressor.
```[gunzip](/man/gunzip) [file].gz```
```[bunzip2](/man/bunzip2) [file].bz2```
```[unxz](/man/unxz) [file].xz```
```[unzstd](/man/unzstd) [file].zst```

> These tools compress single files only. To compress a directory, **tar** it first or use **zip**.

On multi-core machines, **xz -T0** and **zstd -T0** use all cores, and **pigz** is a parallel drop-in for gzip.
```[xz](/man/xz) -T0 [file]```
```[pigz](/man/pigz) [file]```

## Working with Compressed Files
Read, search, and compare compressed text files without unpacking them.
```[zcat](/man/zcat) [file].gz```
```[zless](/man/zless) [file].gz```
```[zgrep](/man/zgrep) "pattern" [file].gz```
```[zdiff](/man/zdiff) [file1].gz [file2].gz```

The other formats have their own cat tools.
```[bzcat](/man/bzcat) [file].bz2```
```[xzcat](/man/xzcat) [file].xz```
```[zstdcat](/man/zstdcat) [file].zst```

## Zip Archives
**zip** is the standard interchange format with Windows and macOS. Use **-r** to include directories recursively and **-e** to encrypt with a password.
```[zip](/man/zip) -r archive.zip [directory]```
```[zip](/man/zip) -e -r secret.zip [directory]```

Extract with **unzip**, into a specific directory with **-d**, or just inspect the contents first.
```[unzip](/man/unzip) archive.zip```
```[unzip](/man/unzip) archive.zip -d [directory]```
```[unzip](/man/unzip) -l archive.zip```
```[zipinfo](/man/zipinfo) archive.zip```

> Zip does not preserve full Unix ownership and permissions. For system backups, stick to **tar**.

## 7-Zip Archives
**7z** offers very high compression ratios and strong AES-256 encryption. **a** adds to an archive, **x** extracts with full paths, **l** lists.
```[7z](/man/7z) a archive.7z [files]```
```[7z](/man/7z) a -p archive.7z [files]```
```[7z](/man/7z) x archive.7z```
```[7z](/man/7z) l archive.7z```

> Use **x** to extract, not **e**: the **e** command flattens all files into the current directory, discarding their paths.

## Rar Archives
Rar is a proprietary format; **unrar** extracts it.
```[unrar](/man/unrar) x archive.rar```
```[unrar](/man/unrar) l archive.rar```

## Universal Extractors
Tools that detect the format for you, handy when you do not want to remember per-format flags.
```[atool](/man/atool) -x archive.tar.gz```
```[unp](/man/unp) archive.rar```
```[dtrx](/man/dtrx) archive.zip```
```[ouch](/man/ouch) decompress archive.tar.zst```

## cpio & ar
**cpio** reads file lists from stdin; it is the format behind initramfs images and RPM packages.
```[find](/man/find) . | [cpio](/man/cpio) -o > archive.cpio```
```[cpio](/man/cpio) -id < archive.cpio```

**ar** creates the archives behind static libraries (.a) and Debian packages (.deb).
```[ar](/man/ar) rcs libfoo.a [object-files]```
```[ar](/man/ar) t package.deb```
