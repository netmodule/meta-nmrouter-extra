SUMMARY = "i2c device access tool"
DESCRIPTION = "A simple tool to access i2c character devices on linux for bringup"
HOMEPAGE = "https://github.com/eichenberger/i2ctool.git"
SECTION = "support/i2c"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7702f203b58979ebbc31bfaeb44f219c"

SRCREV = "a9dc800451f1bbd89d60d1573421bca55afbecbb"
SRC_URI = "git://github.com/eichenberger/i2ctool.git;protocol=https"

S = "${WORKDIR}/git"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

do_install() {
    oe_runmake DESTDIR=${D} install
}
