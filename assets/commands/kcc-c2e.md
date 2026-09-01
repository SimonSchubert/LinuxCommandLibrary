# TAGLINE

convert comics and manga for e-ink readers

# TLDR

Convert a **CBZ** using the default Kindle Voyage profile

```kcc-c2e [comic.cbz]```

Target a **Kindle Paperwhite 5**

```kcc-c2e -p KPW5 [comic.cbz]```

**Manga** layout (right-to-left reading and splitting)

```kcc-c2e -m -p KV [manga.cbz]```

**EPUB/KEPUB** for a Kobo Clara

```kcc-c2e -p KoC -f EPUB [comic.cbz]```

**CBZ** for KOReader (no KindleGen)

```kcc-c2e -p KV -f CBZ [comic.cbz]```

**PDF** for a reMarkable 2

```kcc-c2e -p Rmk2 -f PDF [comic.cbz]```

Set **title and author** and write to a directory

```kcc-c2e -t "[Title]" -a "[Author]" -o [output/] [comic.cbz]```

Keep **color** (do not convert to grayscale)

```kcc-c2e --forcecolor -p KCS [comic.cbz]```

**Webtoon** processing

```kcc-c2e -w -p KV [webtoon.cbz]```

# SYNOPSIS

**kcc-c2e** [_options_] _input_...

# DESCRIPTION

**kcc-c2e** is the command-line comic-to-ebook converter from **Kindle Comic Converter** (KCC). It rebuilds comics and manga as fixed-layout files sized to a specific e-ink screen: pages fill the display without extra margins, blacks are leveled for e-ink, and two-page spreads can be split or rotated. Despite the Kindle-oriented name, it also targets Kobo, reMarkable, and other readers.

Input may be a folder of PNG, JPG, GIF, or WebP images; a CBZ, CBR, CB7, ZIP, RAR, or 7Z archive (archive formats other than a simple ZIP typically need **7z** on PATH); a PDF (images are extracted or rendered); or an EPUB. Output is **MOBI**/**AZW3** (Kindle), **EPUB** (plain **.epub** or Kobo **.kepub.epub**), **CBZ**, **PDF**, **KFX**, or **MOBI+EPUB**. With **-f Auto** (the default), Kindle profiles produce MOBI, Kobo profiles produce EPUB/KEPUB, reMarkable profiles produce PDF, and Kindle DX produces CBZ.

The generated **.mobi** is a dual MOBI/AZW3 container; the **.mobi** extension is kept for compatibility. MOBI and KFX conversion need Amazon **kindlegen** (commonly installed with Kindle Previewer). KOReader users can skip KindleGen by writing CBZ instead.

A Qt GUI is installed as **kcc** (not a shell converter). **kcc-c2p** is a companion CLI that splits tall images into device-height pages.

# PARAMETERS

**-p** _PROFILE_, **--profile** _PROFILE_
> Device profile. Default **KV** (Kindle Voyage, 1072x1448). Kindle examples: **K1**, **K2**, **K34**, **K57**, **K810**, **KDX**, **KPW**, **KV**, **KPW34**, **KPW5**, **KPW6**, **KO**, **K11**, **KCS**, **KS**, **KS3**, **KSCS**. Kobo examples: **KoMT**, **KoG**, **KoGHD**, **KoA**, **KoAHD**, **KoAH2O**, **KoAO**, **KoN**, **KoC**, **KoCC**, **KoL**, **KoLC**, **KoF**, **KoS**, **KoE**. reMarkable: **Rmk1**, **Rmk2**, **RmkPP**, **RmkPPMove**. **OTHER** is an empty custom profile (use **--customwidth** / **--customheight**). Run **-h** for the list shipped with this version.

**-m**, **--manga-style**
> Right-to-left reading and split order (manga). For CBZ output, page-turn direction is still set by the reader.

**-w**, **--webtoon**
> Webtoon processing (tall strip layout). Default max output size is 100 MB instead of 400 MB.

**-f** _FORMAT_, **--format** _FORMAT_
> Output format: **Auto**, **MOBI**, **EPUB**, **CBZ**, **PDF**, **KFX**, or **MOBI+EPUB**. Default **Auto**.

**-o** _PATH_, **--output** _PATH_
> Output directory or file. Default is next to the input.

**-t** _TITLE_, **--title** _TITLE_
> Comic title. Default is the input file or directory name (or ComicInfo.xml / PDF metadata when **--metadatatitle** is set).

**-a** _AUTHOR_, **--author** _AUTHOR_
> Author. Default **KCC**, or ComicInfo.xml / PDF author when present.

**--language** _LANG_
> EPUB language tag. Default **en-US**.

**--nokepub**
> With EPUB output, write **.epub** instead of **.kepub.epub**.

**-b** _N_, **--batchsplit** _N_
> Split large output: **0** none (default), **1** automatic by size, **2** treat each subdirectory as a volume. MOBI/KFX always split unless **2** is used.

**--ts** _MB_, **--targetsize** _MB_
> Maximum output size in MB. Default 400 (100 for webtoon; 95 for reMarkable if unset).

**-r** _N_, **--splitter** _N_
> Double-page handling: **0** split (default), **1** rotate, **2** both.

**-c** _N_, **--cropping** _N_
> Cropping: **0** off, **1** margins, **2** margins and page numbers (default).

**-u**, **--upscale**
> Upscale images smaller than the device resolution.

**-s**, **--stretch**
> Stretch images to the device resolution.

**-n**, **--noprocessing**
> Do not modify images; ignore profile and processing options.

**--forcecolor**
> Keep color; do not convert pages to grayscale.

**--forcepng**
> Write PNG instead of JPEG for black-and-white images (better on jailbroken Kindles with KOReader; can cause blank pages on some stock Kindle firmware).

**--webp**
> Write lossy WebP instead of JPEG and lossless WebP instead of PNG.

**--eraserainbow**
> Reduce rainbow/moire artifacts on color e-ink (Kaleido) by attenuating interfering frequencies.

**-q**, **--hq**
> Increase magnification quality (larger images for panel view).

**-2**, **--two-panel**
> Two panels instead of four in Kindle panel view.

**--lightnovel**
> Only resize images and keep the original file structure.

**--ebok**
> Force the MOBI **EBOK** book type instead of **PDOC**.

**--customwidth** _PX_, **--customheight** _PX_
> Override the profile screen size.

**-d**, **--delete**
> Delete the source file or directory after conversion. Not recoverable.

**-h**, **--help**
> Print the full option list and exit.

# CAVEATS

Not Amazon's **Kindle Comic Creator**, and not endorsed by Amazon.

MOBI/KFX output needs **kindlegen**. Without it, conversion stops at EPUB. CBZ and PDF do not need KindleGen.

Do not open or edit KCC output in **Calibre**. Calibre does not handle this fixed-layout MOBI/EPUB correctly and can break layout and page numbers. Copy the file onto the device over USB (typically the **documents** folder).

Kindle Scribe 2025 MOBI often shows blank pages; PDF is the recommended output. PNG on Kindle Scribe and several formats on Kindle Colorsoft can also blank pages; JPEG is safer on stock firmware.

The CLI exposes combinations that can reduce quality. Prefer a matching **-p** profile over a generic size.

**7z** is optional but much faster, and required for some archive types and features.

Re-converting a file already produced by KCC degrades quality.

# HISTORY

**Kindle Comic Converter** was started in **2012** by **Ciro Mattia Gonano** as a cross-platform alternative to **KindleComicParser**. **Paweł Jastrzębski** (AcidWeb) maintained it from **2013** to **2019**, with later work by **Darodi** and **Alex Xu** (from **2023**). It is written in Python and released under the ISC License. **kcc-c2e** is the comic2ebook CLI; current package version is **11.0.3** (2026).

# INSTALL

```aur: yay -S kcc```

```nix: nix profile install nixpkgs#kcc```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[kcc-c2p](/man/kcc-c2p)(1), [ebook-convert](/man/ebook-convert)(1), [calibre](/man/calibre)(1), [7z](/man/7z)(1)

# RESOURCES

```[Source code](https://github.com/ciromattia/kcc)```

```[Documentation](https://github.com/ciromattia/kcc/wiki)```

<!-- verified: 2026-09-01 -->
