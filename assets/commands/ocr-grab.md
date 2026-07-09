# TAGLINE

X11 region screenshot tool with instant Tesseract OCR to clipboard (Flameshot-like)

# TLDR

**Launch** the selector and OCR the chosen region to clipboard

```ocr-grab```

**Build** from source

```make```

# SYNOPSIS

**ocr-grab**

# DESCRIPTION

OCR Grab is a lightweight C/GTK3 + Tesseract utility for X11. It lets you interactively select a screen region (with adjustment mode) and immediately runs OCR on the selection, copying the extracted text to the clipboard (with xclip fallback for minimal WMs).

It is designed as a fast, keyboard-driven complement or replacement for Flameshot-style workflows when the goal is to capture text rather than an image.

# USAGE

1. Bind `ocr-grab` to a hotkey (e.g. Mod+Print in i3).
2. Drag to select a region.
3. Adjust with mouse if needed.
4. Press Enter to OCR and copy, or Escape to cancel.

A popup shows the result; "Copy & Close" puts it on both primary and selection clipboards.

# CAVEATS

- X11 only (no native Wayland support mentioned).
- Requires tesseract language data (e.g. tesseract-ocr-eng).
- GPL-3.0 licensed.

# RESOURCES

```[Source code](https://github.com/talalalrwas/ocr-grab)```
```[Documentation](https://github.com/talalalrwas/ocr-grab#readme)```

<!-- verified: 2026-07-10 -->

# SEE ALSO

flameshot(1), tesseract(1), xclip(1)