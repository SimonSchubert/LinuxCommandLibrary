# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-gui-bin
pkgver=4.3.0
pkgrel=1
pkgdesc='Linux command reference and cheat sheets - desktop application'
arch=('x86_64')
url='https://github.com/SimonSchubert/LinuxCommandLibrary'
license=('Apache-2.0')
depends=(
  'alsa-lib'
  'bash'
  'fontconfig'
  'glibc'
  'hicolor-icon-theme'
  'java-runtime'
  'libglvnd'
  'libstdc++'
  'libx11'
  'libxext'
  'libxi'
  'libxrender'
  'libxtst'
)
provides=('lcl-gui')
conflicts=('lcl-gui')
options=('!strip')

source=("LinuxCommandLibrary-${pkgver}-linux-x86_64.tar.gz::https://github.com/SimonSchubert/LinuxCommandLibrary/releases/download/v${pkgver}/LinuxCommandLibrary-${pkgver}-linux-x86_64.tar.gz")
sha256sums=('cf0bb3b4954fd63f7e637b15917321a7acfd523bbf24130ca83ac73d9ce41ac3')

package() {
    # Install application files
    install -dm755 "${pkgdir}/opt/lcl-gui"
    cp -r "${srcdir}/LinuxCommandLibrary/"* "${pkgdir}/opt/lcl-gui/"
    chmod -R go-w "${pkgdir}/opt/lcl-gui"

    # Install wrapper script
    install -Dm755 /dev/stdin "${pkgdir}/usr/bin/lcl-gui" << 'EOF'
#!/bin/sh
exec /opt/lcl-gui/bin/LinuxCommandLibrary "$@"
EOF

    # Install desktop entry
    install -Dm644 /dev/stdin "${pkgdir}/usr/share/applications/lcl-gui.desktop" << EOF
[Desktop Entry]
Name=Linux Command Library
Comment=Linux command reference and cheat sheets
Exec=lcl-gui
Icon=lcl-gui
Type=Application
Categories=Utility;
Keywords=Linux;Command;Terminal;Reference;
StartupWMClass=com-linuxcommandlibrary-MainKt
Terminal=false
EOF

    # Install icon
    install -Dm644 "${srcdir}/LinuxCommandLibrary/lib/LinuxCommandLibrary.png" \
        "${pkgdir}/usr/share/icons/hicolor/256x256/apps/lcl-gui.png" 2>/dev/null || \
    install -Dm644 /dev/null "${pkgdir}/usr/share/icons/hicolor/256x256/apps/lcl-gui.png"

    # Install license
    install -Dm644 "${srcdir}/LinuxCommandLibrary/lib/LinuxCommandLibrary.copyright" \
        "${pkgdir}/usr/share/licenses/${pkgname}/LICENSE" 2>/dev/null || true
}
