#!/bin/bash
# -*- ENCODING: UTF-8 -*-

mvn clean install
mvn cobertura:cobertura com.gavinmogan:codacy-maven-plugin:coverage -Dcobertura.report.format=xml -DcoverageReportFile=target/site/cobertura/coverage.xml -DprojectToken=22083380204b4f679a2234a4c4a07fb0 -DapiToken=22083380204b4f679a2234a4c4a07fb0

