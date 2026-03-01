# Compression & Archiving

## Create a tar archive
```[tar](/man/tar) cf [archive].tar [files]```
```[tar](/man/tar) czf [archive].tar.gz [files]```
```[tar](/man/tar) cjf [archive].tar.bz2 [files]```
```[tar](/man/tar) cJf [archive].tar.xz [files]```

## Extract a tar archive
```[tar](/man/tar) xf [archive].tar```
```[tar](/man/tar) xzf [archive].tar.gz```
```[tar](/man/tar) xjf [archive].tar.bz2```
```[tar](/man/tar) xJf [archive].tar.xz```

## Extract to a specific directory
```[tar](/man/tar) xf [archive].tar -C [directory]```

## List archive contents
```[tar](/man/tar) tf [archive].tar```
```[tar](/man/tar) tzf [archive].tar.gz```

## Compress with gzip
```[gzip](/man/gzip) [file]```
```[gzip](/man/gzip) -k [file]```
```[gzip](/man/gzip) -9 [file]```

## Decompress gzip
```[gunzip](/man/gunzip) [file].gz```
```[zcat](/man/zcat) [file].gz```

## Compress with bzip2
```[bzip2](/man/bzip2) [file]```
```[bzip2](/man/bzip2) -k [file]```

## Decompress bzip2
```[bunzip2](/man/bunzip2) [file].bz2```
```[bzcat](/man/bzcat) [file].bz2```

## Compress with xz
```[xz](/man/xz) [file]```
```[xz](/man/xz) -k [file]```
```[xz](/man/xz) -9 [file]```

## Decompress xz
```[unxz](/man/unxz) [file].xz```
```[xzcat](/man/xzcat) [file].xz```

## Compress with zstd
```[zstd](/man/zstd) [file]```
```[zstd](/man/zstd) -k [file]```
```[zstd](/man/zstd) -19 [file]```

## Decompress zstd
```[unzstd](/man/unzstd) [file].zst```
```[zstdcat](/man/zstdcat) [file].zst```

## Create a zip archive
```[zip](/man/zip) [archive].zip [files]```
```[zip](/man/zip) -r [archive].zip [directory]```
```[zip](/man/zip) -e [archive].zip [files]```

## Extract a zip archive
```[unzip](/man/unzip) [archive].zip```
```[unzip](/man/unzip) [archive].zip -d [directory]```
```[unzip](/man/unzip) -l [archive].zip```

## Show zip archive info
```[zipinfo](/man/zipinfo) [archive].zip```

## Create a 7z archive
```[7z](/man/7z) a [archive].7z [files]```

## Extract a 7z archive
```[7z](/man/7z) x [archive].7z```

## List 7z archive contents
```[7z](/man/7z) l [archive].7z```

## Create a cpio archive
```[find](/man/find) . | [cpio](/man/cpio) -o > [archive].cpio```

## Extract a cpio archive
```[cpio](/man/cpio) -id < [archive].cpio```

## Extract a rar archive
```[unrar](/man/unrar) x [archive].rar```

## Create an ar archive
```[ar](/man/ar) rcs [archive].a [files]```
