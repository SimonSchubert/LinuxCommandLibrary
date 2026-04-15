# TAGLINE

Generate and validate Apple App Clip Codes

# TLDR

**Generate** an App Clip Code as SVG

```AppClipCodeGenerator generate --url [https://example.com] --type [cam] --foreground [FFFFFF] --background [000000] --output [output.svg]```

**Generate** an NFC-enabled App Clip Code

```AppClipCodeGenerator generate --url [https://example.com] --type [nfc] --foreground [FFFFFF] --background [000000] --output [output.svg]```

**Validate colors** and get suggestions

```AppClipCodeGenerator suggest --foreground [FFFFFF] --background [000000]```

# SYNOPSIS

**AppClipCodeGenerator** \<command\> [_options_]

# PARAMETERS

**generate**
> Generate an App Clip Code SVG file

**suggest**
> Validate color combinations and get suggestions

**--url** _URL_
> The URL that opens when the App Clip Code is scanned

**--type** _cam|nfc_
> Code type: **cam** for camera-only scanning or **nfc** for NFC-enabled codes

**--foreground** _RRGGBB_
> Foreground color as a hex value

**--background** _RRGGBB_
> Background color as a hex value

**--output** _path_
> Output path for the generated SVG file

# DESCRIPTION

**AppClipCodeGenerator** is Apple's official command-line tool for creating and validating App Clip Codes. App Clip Codes are visually distinctive, scannable codes that launch App Clip experiences on iOS devices — lightweight app experiences that can be discovered without installing the full app.

The tool generates App Clip Codes as SVG files with two code types: **cam** codes that are scannable by the device camera, and **nfc** codes that additionally support Near Field Communication for tap-to-open functionality. The **suggest** command validates that foreground and background color combinations meet Apple's contrast and readability requirements.

App Clip Codes encode a URL that maps to a registered App Clip experience through Apple's App Store Connect configuration.

# CAVEATS

Available only on **macOS** as part of Apple's developer tools. The tool must be downloaded separately from Apple's App Clip resources page. Generated codes require a registered App Clip experience configured in **App Store Connect** to function. Color combinations must meet Apple's contrast requirements — use the **suggest** command to validate colors before generating.

# HISTORY

AppClipCodeGenerator was released by **Apple** alongside **App Clips** in **iOS 14** (2020). App Clips were introduced at **WWDC 2020** as a way to provide focused app experiences discoverable through Safari, Maps, NFC tags, and QR codes. The code generator tool enables developers to create the proprietary App Clip Code format that is visually distinct from standard QR codes.

# SEE ALSO

[xcodebuild](/man/xcodebuild)(1), [xcrun](/man/xcrun)(1)
