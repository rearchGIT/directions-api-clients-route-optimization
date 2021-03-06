/* 
 * Route Optimization API
 *
 * Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package graphhopper

type Route struct {

	// id of vehicle that operates route
	VehicleId string `json:"vehicle_id,omitempty"`

	// distance of route in meter
	Distance int64 `json:"distance,omitempty"`

	// transport time of route in ms
	TransportTime int64 `json:"transport_time,omitempty"`

	// completion time of route in ms
	CompletionTime int64 `json:"completion_time,omitempty"`

	// waiting time of route in ms
	WaitingTime int64 `json:"waiting_time,omitempty"`

	// array of activities
	Activities []Activity `json:"activities,omitempty"`
}
