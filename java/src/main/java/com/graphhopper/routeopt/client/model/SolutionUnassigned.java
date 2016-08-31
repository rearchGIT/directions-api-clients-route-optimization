/**
 * Route Optimization API
 * Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.graphhopper.routeopt.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * SolutionUnassigned
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-31T10:35:10.244+02:00")
public class SolutionUnassigned   {
  @SerializedName("services")
  private List<String> services = new ArrayList<String>();

  @SerializedName("shipments")
  private List<String> shipments = new ArrayList<String>();

  public SolutionUnassigned services(List<String> services) {
    this.services = services;
    return this;
  }

  public SolutionUnassigned addServicesItem(String servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * An array of ids of unassigned services
   * @return services
  **/
  @ApiModelProperty(example = "null", value = "An array of ids of unassigned services")
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public SolutionUnassigned shipments(List<String> shipments) {
    this.shipments = shipments;
    return this;
  }

  public SolutionUnassigned addShipmentsItem(String shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * An array of ids of unassigned shipments
   * @return shipments
  **/
  @ApiModelProperty(example = "null", value = "An array of ids of unassigned shipments")
  public List<String> getShipments() {
    return shipments;
  }

  public void setShipments(List<String> shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionUnassigned solutionUnassigned = (SolutionUnassigned) o;
    return Objects.equals(this.services, solutionUnassigned.services) &&
        Objects.equals(this.shipments, solutionUnassigned.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(services, shipments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionUnassigned {\n");
    
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
